package com.cmc.hibernate.modelo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmc.hibernate.dao.HistoryDigitalDAO;
import com.cmc.hibernate.repositorio.IHistoryDigital;
import com.cmc.log4j.Traza_Log;
import com.cmc.objetos.Dato;
import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryDigital;
import com.cmc.objetos.TagDictionary;
import com.cmc.persistencia.HistoryDigital;
import com.cmc.util.Conversiones;


@Service
public class Gestion_HistoryDigital implements IGestion_HistoryDigital{

	//@Autowired
	//private HistoryDigitalDAO historyDigital_dao;
	@Autowired
	private IHistoryDigital historyDigital_repo;
	

	//Métodos propios
	
	@Override
	@Transactional
	public boolean cargarHistorico(JSHistoryDigital objeto,Diccionario diccionario) {
		try  {
			if (diccionario != null) {

			
				List<TagDictionary> tagNames = diccionario.getDiccionario().get(objeto.getIp());	
				List<HistoryDigital> resultados = new ArrayList<HistoryDigital>();
				Timestamp fecha = Conversiones.toTimestamp(objeto.getFecha());

			
			for (Dato o : objeto.getDatos()) {
				
				HistoryDigital resultado = new HistoryDigital();
				resultado.setFecha(fecha);
				resultado.setValor(Conversiones.toBoolean(o.getValor()));
				resultado.setTagName(tagNames.stream().filter(x -> Conversiones.toInt(o.getId())==x.getId()).map(TagDictionary::getTagname)
						.findAny().orElse(""));
								
				if (resultado.getFecha()== null || resultado.getValor() == null || resultado.getTagName() == ("")) {
					
					Traza_Log.registro("sql.conversion.null",Traza_Log.LOG_ERROR, new String[]{resultado.toString()});
				}
				else {		
					resultados.add(resultado);	
				}
			
			}
			
				// Save de los resultados
				//historyDigital_dao.cargarResultados(resultados);
				cargarResultados(resultados);
			
			}else {
				
				Traza_Log.registro("Diccionario no generado, recibido un null",Traza_Log.LOG_ERROR);
				return false;
			}		
			
			
			return true;
		} catch (Exception e) {
			Traza_Log.registro(e.getMessage());
			return false;
		}
	}
	
	@Transactional
	public boolean cargarResultados(List<HistoryDigital> resultados) {
		try  {
			
			if (resultados != null) {
				int size = resultados.size();
				int counter = 0;
				
				List<HistoryDigital> temp = new ArrayList<>();
				
				for (HistoryDigital hd : resultados) {
					temp.add(hd);

					if ((counter + 1) % 500 == 0 || (counter + 1) == size) {						
						historyDigital_repo.saveAll(temp);
						temp.clear();
					}

					counter++;
				}
				
				return true;
				
			}else {
				
				Traza_Log.registro("No hay elementos a insertar en la tabla de históricos");
				return false;
			}


		} catch (Exception e) {
			Traza_Log.registro(e.getMessage());
			return false;
		}
	}

	
}
