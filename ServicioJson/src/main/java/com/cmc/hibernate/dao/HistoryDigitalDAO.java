package com.cmc.hibernate.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.repositorio.IHistoryDigital;
import com.cmc.log4j.Traza_Log;
import com.cmc.persistencia.HistoryDigital;


@Repository
public class HistoryDigitalDAO {
	@Autowired
	private IHistoryDigital historyDigital_repo;

	//Métodos CRUD Hibernate
	
	@Transactional
	public boolean cargarResultados(List<HistoryDigital> resultados) {
		try  {
			
			if (resultados != null) {
					
				historyDigital_repo.saveAll(resultados);				
				return true;
				
			}else {
				
				Traza_Log.registro("objeto.null",Traza_Log.LOG_ERROR,new String[]{"lista HistoryAnalogic"});
				return false;
			}


		} catch (Exception e) {
			Traza_Log.registro("try.catch.exception",Traza_Log.LOG_ERROR,new String[]{"cargarResultados digital",e.getMessage()});
			return false;
		}
	}

}
