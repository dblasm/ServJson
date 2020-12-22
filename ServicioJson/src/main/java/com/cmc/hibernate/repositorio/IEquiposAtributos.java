package com.cmc.hibernate.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cmc.persistencia.EquiposAtributos;

@Repository
public interface IEquiposAtributos extends JpaRepository <EquiposAtributos, Long>{			
	
}
