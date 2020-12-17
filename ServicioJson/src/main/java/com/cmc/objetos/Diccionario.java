package com.cmc.objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cmc.log4j.Traza_Log;
import com.cmc.persistencia.TObjeto;

public class Diccionario {

	public Map<String, List<TagDictionary>> diccionario;

	public Diccionario() {

	}

	public Map<String, List<TagDictionary>> getDiccionario() {
		return diccionario;
	}

	public void generarDiccionario(List<TObjeto> rs) {

		try {

			Traza_Log.registro("  ##### Se va a proceder a generar el diccionario #####");

			Map<String, List<TagDictionary>> dicc = new HashMap<String, List<TagDictionary>>();

			// Recorremos los TObjeto para organizar por ip los idPlc y tagname

			for (TObjeto item : rs) {
				if (!dicc.containsKey(item.getIp())) {
					dicc.put(item.getIp(), new ArrayList<TagDictionary>());
				}
				dicc.get(item.getIp()).add(new TagDictionary(item.getTagName(), item.getIdValor()));
			}

			Traza_Log.registro(" ##### Diccionario generado:" + dicc.toString() + " ######");
			setDiccionario(dicc);

		} catch (Exception e) {
			Traza_Log.registro(e.getMessage());
			setDiccionario(null);
		}
	}

	public void setDiccionario(Map<String, List<TagDictionary>> dicc) {

		this.diccionario = dicc;

	}

}
