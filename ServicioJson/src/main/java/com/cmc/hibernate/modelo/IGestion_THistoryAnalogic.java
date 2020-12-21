package com.cmc.hibernate.modelo;


import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryAnalogic;


public interface IGestion_THistoryAnalogic {
	
	public abstract boolean cargarHistorico(JSHistoryAnalogic objeto,Diccionario diccionario);

}