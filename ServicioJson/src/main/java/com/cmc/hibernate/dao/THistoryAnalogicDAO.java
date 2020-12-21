package com.cmc.hibernate.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.repositorio.IHistoryAnalogic;
import com.cmc.log4j.Traza_Log;
import com.cmc.persistencia.HistoryAnalogic;

@Repository
public class THistoryAnalogicDAO {
	
	@Autowired
	private IHistoryAnalogic tHistoryAnalogic_repo;

	//Métodos CRUD Hibernate
	
	@Transactional
	public boolean cargarResultados(List<HistoryAnalogic> resultados) {
		try  {
			
			if (resultados != null) {			
				tHistoryAnalogic_repo.saveAll(resultados);
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
