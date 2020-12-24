package com.cmc.hibernate.controlador;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.cmc.objetos.JSHistoryDigital;
import com.cmc.objetos.Mensaje;
import com.cmc.objetos.Response;
import com.cmc.hibernate.modelo.Gestion_HistoryAnalogic;
import com.cmc.hibernate.modelo.Gestion_HistoryDigital;
import com.cmc.hibernate.modelo.Gestion_Equipos;


@RestController
@Controller
@RequestMapping("/historico/v0/")
public class Controlador {
	
	private static Diccionario diccionario; 

//Inyección beans
	
	@Autowired
	private Gestion_HistoryAnalogic gestion_historyAnalogic;
	@Autowired
	private Gestion_HistoryDigital gestion_historyDigital;
	@Autowired
	private Gestion_Equipos gestion_Equipos;

//Consulta Json para datos Analógicos

	@GetMapping("/historyAnalogic/")
    public ResponseEntity<Boolean> datosHistoricos(@Valid @RequestBody JSHistoryAnalogic JSHistoryAnalogic) {
		
		if (diccionario == null) {
			diccionario = gestion_Equipos.crearDiccionario();
			
		}			
			
        return ResponseEntity.ok().body(gestion_historyAnalogic.cargarHistorico(JSHistoryAnalogic,diccionario));
    }
	

	//Consulta Json para datos Digitales
	
	@GetMapping("/historyDigital/")
    public ResponseEntity<Boolean> datosHistoricos(@Valid @RequestBody JSHistoryDigital JSHistoryDigital) {
		
		if (diccionario == null) {
			diccionario = gestion_Equipos.crearDiccionario();
			
		}			
			
        return ResponseEntity.ok().body(gestion_historyDigital.cargarHistorico(JSHistoryDigital,diccionario));
    }
	
	//Respuesta para Tridium
	
		@GetMapping("/tridium/")
	    public ResponseEntity<Response> respuesta() {
			
			List<Mensaje> datos =new ArrayList<>();
			Mensaje data = new Mensaje (1,"172.16.100.1","ok",true);
			datos.add(data);
			data = new Mensaje (2,"172.16.100.2","fallo en guardar todos los registros",false);	
			datos.add(data);
			data = new Mensaje (3,"172.16.100.3","aviso",true);	
			datos.add(data);
						
	        return ResponseEntity.ok().body(new Response("2020-12-23 17:45:33","enviado desde servicio JSON",datos));
	        
	    }
	
	
}
