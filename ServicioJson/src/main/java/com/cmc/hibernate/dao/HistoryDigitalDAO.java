package com.cmc.hibernate.dao;

import java.util.ArrayList;
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
				int size = resultados.size();
				int counter = 0;
				
				List<HistoryDigital> temp = new ArrayList<>();
				
				for (HistoryDigital hd : resultados) {
					temp.add(hd);

					if ((counter + 1) % 500 == 0 || (counter + 1) == size) {						
						historyDigital_repo.saveAll(temp);
						temp.clear();
						
					}

					counter++;
				}
				
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

/*
	
	@Transactional
	public void saveEmployees(List<Employee> employees) {
		int size = employees.size();
		int counter = 0;

		List<Employee> temp = new ArrayList<>();

		for (Employee emp : employees) {
			temp.add(emp);

			if ((counter + 1) % 500 == 0 || (counter + 1) == size) {
				employeeRepository.saveAll(temp);
				temp.clear();
			}

			counter++;
		}
	}

*/