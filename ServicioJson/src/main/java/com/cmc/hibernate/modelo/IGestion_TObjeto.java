package com.cmc.hibernate.modelo;


import com.cmc.objetos.Diccionario;
import com.cmc.objetos.ObjOrigen;


public interface IGestion_TObjeto {

	public abstract boolean cargarHistorico(ObjOrigen objeto,Diccionario diccionario);


}