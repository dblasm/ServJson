package com.cmc.hibernate.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.EquiposDAO;
import com.cmc.hibernate.repositorio.IEquiposAtributos;
import com.cmc.persistencia.EquiposAtributos;

@Repository
public class EquiposDAO {

	@Autowired
	private IEquiposAtributos equiposAtributos;

	// Métodos CRUD Hibernate

	@Transactional
	public List<EquiposAtributos> buscarTodo() {		
		
		return equiposAtributos.findAll();
		
	}

	/*	
		@Transactional 
	public List<EquiposAtributos> consultaEquiposAtributos() {
	    
		
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Traza_Log.registro("INNER JOIN Equipo y Atributos");
            String hql = ("FROM Equipo e INNER JOIN Atributo a ON e.id_tipo = e.id_tipo");
			Query query = session.createQuery(hql);
			return query.getResultList();

        } catch (Exception e) {
        	Traza_Log.registro(e.getMessage());
            return null;
        }

	}
	*/

}
