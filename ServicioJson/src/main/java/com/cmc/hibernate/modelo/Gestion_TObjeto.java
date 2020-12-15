package com.cmc.hibernate.modelo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.cmc.hibernate.dao.TObjetoDAO;
import com.cmc.objetos.Diccionario;


/**
 * 
 * 
 * @author Déborah Blas Muñoz.
 * @version 1.0.
 * @since 10/12/2020.
 *
 */

@Component("gestion_tObjetoRepositorio")
@Service
public class Gestion_TObjeto implements IGestion_TResultado {

	private static final Logger log = LoggerFactory.getLogger(Gestion_TObjeto.class);
	

	public static Logger getLog() {
		return log;
	}

	@Autowired
	private TObjetoDAO tObjetoDAO;
	

	// *************** CONSULTAS ***************
	
	// Crea el diccionario
	public  Diccionario crearDiccionario(){
		
		Diccionario diccionario = new Diccionario();
		diccionario.generarDiccionario(tObjetoDAO.buscarTodo());
		
		return diccionario;
		
	}
	
}
