package com.cmc.hibernate.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmc.persistencia.HistoryDigital;

public interface IHistoryDigital extends JpaRepository <HistoryDigital, String>{

}
