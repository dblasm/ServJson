package com.cmc.objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cmc.persistencia.TObjeto;


public class Diccionario  {
	
	private static final Logger log = LoggerFactory.getLogger(Diccionario.class);
	public Map<String, List<TagDictionary>> diccionario;	
	
	

public Diccionario() {			
			
	}


public Map<String, List<TagDictionary>> getDiccionario() {
	return diccionario;
}


public void generarDiccionario(List<TObjeto> rs){
	
	try  {
		
		log.info("  ##### Se va a proceder a generar el diccionario #####");				
		
		Map<String, List<TagDictionary>> dicc = new HashMap<String, List<TagDictionary>>();
		
		
		//Recorremos los TObjeto para organizar por ip los idPlc y tagname
		
		for (TObjeto item : rs) {
	        if (!dicc.containsKey(item.getIp())) {
	            dicc.put(item.getIp(), new ArrayList<TagDictionary>());
	        }
	        dicc.get(item.getIp()).add(new TagDictionary(item.getTagName(),item.getIdValor()));
		}
		
		log.info(" ##### Diccionario generado:" + dicc.toString() + " ######");					
		setDiccionario(dicc);
	
		} catch (Exception e) {
			log.info(e.getMessage());
			setDiccionario(null);
		}
}
	

public void setDiccionario(Map<String, List<TagDictionary>> dicc) {
	
	this.diccionario = dicc;
	
}

}

