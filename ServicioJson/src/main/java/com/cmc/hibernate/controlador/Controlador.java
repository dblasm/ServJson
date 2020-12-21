package com.cmc.hibernate.controlador;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.objetos.Diccionario;
import com.cmc.objetos.JSHistoryAnalogic;
import com.cmc.hibernate.modelo.Gestion_THistoryAnalogic;
import com.cmc.hibernate.modelo.Gestion_TObjeto;


@RestController
@Controller
@RequestMapping("/historico/v0/")
public class Controlador {
	
	private static Diccionario diccionario; 

//Inyección beans
	
	@Autowired
	private Gestion_THistoryAnalogic gestion_tHistoryAnalogic;
	@Autowired
	private Gestion_TObjeto gestion_tObjeto;
	

//Consulta Json

	@GetMapping("/historyAnalogic/")
    public ResponseEntity<Boolean> datosHistoricos(@Valid @RequestBody JSHistoryAnalogic JSHistoryAnalogic) {
		
		if (diccionario == null) {
			diccionario = gestion_tObjeto.crearDiccionario();
			
		}			
			
        return ResponseEntity.ok().body(gestion_tHistoryAnalogic.cargarHistorico(JSHistoryAnalogic,diccionario));
    }
	
	
	
	
	
}
