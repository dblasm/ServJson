package com.cmc.hibernate.modelo;

import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryDigital;

public interface IGestion_HistoryDigital {

	public abstract boolean cargarHistorico (JSHistoryDigital objeto, Diccionario diccionario);
}
