package com.cmc.objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cmc.log4j.Traza_Log;
import com.cmc.persistencia.VEquiposAtributos;
import com.cmc.persistencia.TEquipo;

public class Diccionario {

	public Map<String, List<TagDictionary>> diccionario;

	public Diccionario() {

	}

	public Map<String, List<TagDictionary>> getDiccionario() {
		return diccionario;
	}

	public void generarDiccionario(List<VEquiposAtributos> rs) {

		try {
			if (rs!=null) {


				Traza_Log.registro("  ##### Se va a proceder a generar el diccionario #####");
	
				Map<String, List<TagDictionary>> dicc = new HashMap<String, List<TagDictionary>>();
				
				
	
				// Recorremos los TObjeto para organizar por ip los idPlc y tagname
	
				/*for (EquiposAtributos item : rs) {
					if (!dicc.containsKey(item.getIp())) {
						dicc.put(item.getIp(), new ArrayList<TagDictionary>());
					}
					dicc.get(item.getIp()).add(new TagDictionary(item.getTagName(), item.getIdPlc(),item.getEscalado(),item.isEsEscalado(),item.isAgregado(),item.getTiempoAgregado()));
					
				}*/
	
				Traza_Log.registro(" ##### Diccionario generado:" + dicc.toString() + " ######");
				setDiccionario(dicc);
			}else {
				Traza_Log.registro(" No se ha encontrado datos en la tabla de ip's, por lo tanto no se genera el diccionario");	
			}

		} catch (Exception e) {
			Traza_Log.registro(e.getMessage());
			setDiccionario(null);
		}
	}

	public void setDiccionario(Map<String, List<TagDictionary>> dicc) {

		this.diccionario = dicc;

	}

}
