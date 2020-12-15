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
import com.cmc.objetos.ObjOrigen;
import com.cmc.hibernate.modelo.Gestion_TResultado;
import com.cmc.hibernate.modelo.Gestion_TObjeto;


@RestController
@Controller
@RequestMapping("/historico/v0/")
public class Controlador {

	
	// ******************* MÉTODOS PROPIOS *******************
	private static Diccionario diccionario;
	@Autowired
	private Gestion_TResultado gestion_tObjeto;
	@Autowired
	private Gestion_TObjeto gestion_tObjetoRepositorio;
	

	

	//public Controlador() {
	//	super();
//		diccionario = new Diccionario();		
	//}

	@GetMapping("/datosHistoricos/")
    public ResponseEntity<Boolean> datosHistoricos(@Valid @RequestBody ObjOrigen objeto) {
		
		if (diccionario == null) {
			diccionario = gestion_tObjetoRepositorio.crearDiccionario();
			
		}			
			
        return ResponseEntity.ok().body(gestion_tObjeto.cargarHistorico(objeto,diccionario));
    }
	
	
	
	
	
}
