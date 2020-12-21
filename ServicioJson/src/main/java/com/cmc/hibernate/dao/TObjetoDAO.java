package com.cmc.hibernate.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.TObjetoDAO;
import com.cmc.hibernate.repositorio.IEquiposAtributos;
import com.cmc.persistencia.VEquiposAtributos;

@Repository
public class TObjetoDAO {

	@Autowired
	private IEquiposAtributos equiposAtributos;

	// Métodos CRUD Hibernate

	@Transactional
	public List<VEquiposAtributos> buscarTodo() {
		return equiposAtributos.findAll();

	}
}
