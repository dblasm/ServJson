package com.cmc.hibernate.modelo;


import com.cmc.objetos.Diccionario;
import com.cmc.objetos.Response;


public interface IGestion_Equipos {

	public  abstract Diccionario crearDiccionario();
	
	public  abstract Response crearRespuesta();


}