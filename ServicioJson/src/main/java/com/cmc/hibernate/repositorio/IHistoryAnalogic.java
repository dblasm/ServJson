package com.cmc.hibernate.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmc.persistencia.HistoryAnalogic;

@Repository
public interface IHistoryAnalogic extends JpaRepository <HistoryAnalogic, Long>{
	
}
