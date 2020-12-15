package com.cmc.hibernate.dao;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.TObjetoDAO;
import com.cmc.hibernate.repositorio.TObjetoRepositorio;
import com.cmc.persistencia.TObjeto;



@Repository
public class TObjetoDAO  {

	private static final Logger log = LoggerFactory.getLogger(TObjetoDAO.class);
	
	@Autowired
	private TObjetoRepositorio tObjetoRepositorio;	
	
	
	// ***** DECLARACIÓN DE MÉTODOS PROPIOS******
	
	@Transactional
	public  List<TObjeto> buscarTodo(){
		
		return tObjetoRepositorio.findAll();
		
	}
}
