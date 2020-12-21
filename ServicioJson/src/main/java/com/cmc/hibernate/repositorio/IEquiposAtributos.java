package com.cmc.hibernate.repositorio;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmc.persistencia.TEquipo;
import com.cmc.persistencia.VEquiposAtributos;
import com.cmc.persistencia.TAtributos;


@Repository
public interface IEquiposAtributos extends JpaRepository <VEquiposAtributos, Integer>{

			
	
}
