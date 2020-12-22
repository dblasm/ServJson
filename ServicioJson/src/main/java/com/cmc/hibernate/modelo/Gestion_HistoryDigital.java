package com.cmc.hibernate.modelo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmc.hibernate.dao.HistoryDigitalDAO;
import com.cmc.log4j.Traza_Log;
import com.cmc.objetos.Dato;
import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryDigital;
import com.cmc.objetos.TagDictionary;
import com.cmc.persistencia.HistoryDigital;
import com.cmc.util.Conversiones;


@Service
public class Gestion_HistoryDigital implements IGestion_HistoryDigital{

	@Autowired
	private HistoryDigitalDAO historyDigital_dao;
	

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
				resultado.setTagName(tagNames.stream().filter(x -> o.getId().equals(x.getAttrname())).map(TagDictionary::getTagname)
						.findAny().orElse(""));
								
				if (resultado.getFecha()== null || resultado.getValor() == null || resultado.getTagName() == ("")) {
					
					Traza_Log.registro("sql.conversion.null",Traza_Log.LOG_ERROR, new String[]{resultado.toString()});
				}
				else {		
					resultados.add(resultado);	
				}
			
			}
			
				// Save de los resultados
				historyDigital_dao.cargarResultados(resultados);
			
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

	
}
