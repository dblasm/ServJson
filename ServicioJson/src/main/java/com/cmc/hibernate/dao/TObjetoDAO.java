package com.cmc.hibernate.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.TObjetoDAO;
import com.cmc.hibernate.repositorio.TObjetoRepositorio;
import com.cmc.persistencia.TObjeto;

@Repository
public class TObjetoDAO {

	@Autowired
	private TObjetoRepositorio tObjetoRepositorio;

	// Métodos CRUD Hibernate

	@Transactional
	public List<TObjeto> buscarTodo() {
		return tObjetoRepositorio.findAll();

	}
}
