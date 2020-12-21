package com.cmc.hibernate.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.TObjetoDAO;
import com.cmc.hibernate.repositorio.TDiccionarioRepositorio;
import com.cmc.persistencia.TDato;

@Repository
public class TObjetoDAO {

	@Autowired
	private TDiccionarioRepositorio tObjetoRepositorio;

	// Métodos CRUD Hibernate

	@Transactional
	public List<TDato> buscarTodo() {
		return tObjetoRepositorio.findAll();

	}
}
