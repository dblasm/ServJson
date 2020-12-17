package com.cmc.hibernate.modelo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.TResultadoDAO;
import com.cmc.log4j.Traza_Log;
import com.cmc.objetos.Dato;
import com.cmc.objetos.Diccionario;
import com.cmc.objetos.ObjOrigen;
import com.cmc.objetos.TagDictionary;
import com.cmc.persistencia.TResultado;
import com.cmc.util.Conversiones;

/**
 * 
 * 
 * @author Déborah Blas Muñoz.
 * @version 1.0.
 * @since 10/12/2020.
 *
 */

// TODO: Asignar anotación correcta!!!!
@Component("gestion_tObjeto")
@Service
public class Gestion_TResultado implements IGestion_TObjeto {


	@Autowired
	private TResultadoDAO tResultado_dao;
	

	//Métodos propios
	
	@Override
	@Transactional
	public boolean cargarHistorico(ObjOrigen objeto,Diccionario diccionario) {
		try  {
			
			List<TagDictionary> tagNames = diccionario.getDiccionario().get(objeto.getIp());			
			List<TResultado> resultados = new ArrayList<TResultado>();
			
			for (Dato o : objeto.getDatos()) {
				
				TResultado resultado = new TResultado();
				resultado.setFecha(Conversiones.toTimestamp(objeto.getFecha()));
				resultado.setValor(Conversiones.toFloat(o.getValor()));
				resultado.setTagName(tagNames.stream().filter(x -> o.getId().equals(x.getIdPlc())).map(TagDictionary::getTagname)
						.findAny().orElse(""));
								
				if (resultado.getFecha()== null || resultado.getValor() == null || resultado.getTagName() == ("")) {
					
				Traza_Log.registro("El objeto : " + resultado.toString() + "no se ha insertado en la base de datos",5);
				}
				else {		
					resultados.add(resultado);	
				}
			
			}
			
			// Save de los resultados
			tResultado_dao.cargarResultados(resultados);
			
			return true;
		} catch (Exception e) {
			Traza_Log.registro(e.getMessage());
			return false;
		}
	}

	
}
