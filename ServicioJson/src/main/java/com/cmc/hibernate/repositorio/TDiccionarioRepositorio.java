package com.cmc.hibernate.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmc.persistencia.TDato;
import com.cmc.persistencia.TTipo;

@Repository
public interface TDiccionarioRepositorio extends JpaRepository <TDato, TTipo>{
	
}
