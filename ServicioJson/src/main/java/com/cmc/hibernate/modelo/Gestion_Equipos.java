package com.cmc.hibernate.modelo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cmc.hibernate.dao.EquiposDAO;
import com.cmc.objetos.Diccionario;


/**
 * 
 * 
 * @author Déborah Blas Muñoz.
 * @version 1.0.
 * @since 10/12/2020.
 *
 */


@Service
public class Gestion_Equipos implements IGestion_Equipos {


	@Autowired
	private EquiposDAO equiposDAO;
	
	
	// Crea el diccionario
	public  Diccionario crearDiccionario(){
		
		Diccionario diccionario = new Diccionario();
		diccionario.generarDiccionario(equiposDAO.buscarTodo());
		
		return diccionario;
		
	}
	
}
