package com.cmc.hibernate.modelo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmc.hibernate.controlador.Controlador;
import com.cmc.hibernate.dao.HistoryAnalogicDAO;
import com.cmc.log4j.Traza_Log;
import com.cmc.objetos.Dato;
import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryAnalogic;
import com.cmc.objetos.TagDictionary;
import com.cmc.persistencia.HistoryAnalogic;
import com.cmc.util.Conversiones;

/**
 * 
 * 
 * @author Déborah Blas Muñoz.
 * @version 1.0.
 * @since 10/12/2020.
 *
 */


@Service
public class Gestion_HistoryAnalogic implements IGestion_HistoryAnalogic {


	@Autowired
	private HistoryAnalogicDAO historyAnalogic_dao;
	

	//Métodos propios
	
	@Override
	@Transactional
	public boolean cargarHistorico(JSHistoryAnalogic objeto,Diccionario diccionario) {
		try  {
			if (diccionario != null) {

			
				List<TagDictionary> tagNames = diccionario.getDiccionario().get(objeto.getIp());	
				List<HistoryAnalogic> resultados = new ArrayList<HistoryAnalogic>();
				Timestamp fecha = Conversiones.toTimestamp(objeto.getFecha());

			
			for (Dato o : objeto.getDatos()) {
				
				HistoryAnalogic resultado = new HistoryAnalogic();
				resultado.setFecha(fecha);
				resultado.setValor(Conversiones.toFloat(o.getValor()));
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
				Controlador.respuesta.setFecha(new Date().toString());				
				Controlador.respuesta.modificar(objeto.getIp(),objeto.getFecha(),"Analogic ,datos recibidos: " + objeto.getDatos().size() + " datos a escribir: " + resultados.size(),true);
				historyAnalogic_dao.cargarResultados(resultados);
			
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
