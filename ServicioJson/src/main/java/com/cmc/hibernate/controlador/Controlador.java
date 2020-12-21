package com.cmc.hibernate.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryAnalogic;
import com.cmc.persistencia.Equipo;
import com.cmc.persistencia.EquiposAtributos;
import com.cmc.hibernate.dao.EquiposDAO;
import com.cmc.hibernate.modelo.Gestion_HistoryAnalogic;
import com.cmc.hibernate.modelo.Gestion_Equipos;


@RestController
@Controller
@RequestMapping("/historico/v0/")
public class Controlador {
	
	private static Diccionario diccionario; 

//Inyección beans
	
	@Autowired
	private Gestion_HistoryAnalogic gestion_tHistoryAnalogic;
	@Autowired
	private Gestion_Equipos gestion_Equipos;

//Consulta Json para datos Analógicos

	@GetMapping("/historyAnalogic/")
    public ResponseEntity<Boolean> datosHistoricos(@Valid @RequestBody JSHistoryAnalogic JSHistoryAnalogic) {
		
		if (diccionario == null) {
			diccionario = gestion_Equipos.crearDiccionario();
			
		}			
			
        return ResponseEntity.ok().body(gestion_tHistoryAnalogic.cargarHistorico(JSHistoryAnalogic,diccionario));
    }
	

	//Consulta Json para datos Digitales
	/*
	@GetMapping("/historyDigital/")
    public ResponseEntity<Boolean> datosHistoricos(@Valid @RequestBody JSHistoryDigital JSHistoryDigital) {
		
		if (diccionario == null) {
			diccionario = gestion_tObjeto.crearDiccionario();
			
		}			
			
        return ResponseEntity.ok().body(gestion_tHistoryDigital.cargarHistorico(JSHistoryDigital,diccionario));
    }
	*/
	
}
