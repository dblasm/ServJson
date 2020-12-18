package com.cmc.hibernate.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.repositorio.TResultadoRepositorio;
import com.cmc.log4j.Traza_Log;
import com.cmc.persistencia.TResultado;

@Repository
public class TResultadoDAO {
	
	@Autowired
	private TResultadoRepositorio tResultado_repo;

	//Métodos CRUD Hibernate
	
	@Transactional
	public boolean cargarResultados(List<TResultado> resultados) {
		try  {
			
			if (resultados != null) {			
				tResultado_repo.saveAll(resultados);
				return true;
			}else {
				
				Traza_Log.registro("No hay elementos a insertar en la tabla de históricos");
				return false;
			}


		} catch (Exception e) {
			Traza_Log.registro(e.getMessage());
			return false;
		}
	}

}
