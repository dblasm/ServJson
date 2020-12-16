package com.cmc.hibernate.modelo;



import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cmc.hibernate.dao.TResultadoDAO;
import com.cmc.objetos.Dato;
import com.cmc.objetos.Diccionario;
import com.cmc.objetos.ObjOrigen;
import com.cmc.objetos.TagDictionary;
import com.cmc.persistencia.TResultado;
import com.cmc.util.Conversiones;

/**
 * 
 * 
 * @author Déborah Blas Muñoz.
 * @version 1.0.
 * @since 10/12/2020.
 *
 */

@Component("gestion_tObjeto")
@Service
public class Gestion_TResultado implements IGestion_TObjeto {

	private static final Logger log = LoggerFactory.getLogger(Gestion_TResultado.class);
	

	public static Logger getLog() {
		return log;
	}


	@Autowired
	private TResultadoDAO tResultado_dao;
	

	// *************** CONSULTAS ***************
	
	@Override
	@Transactional
	public boolean cargarHistorico(ObjOrigen objeto,Diccionario diccionario) {
		try  {
			
			List<TagDictionary> tagNames = diccionario.getDiccionario().get(objeto.getIp());
			
			TResultado resultado = new TResultado();
			List<TResultado> resultados = new ArrayList<TResultado>();
			
			for (Dato o : objeto.getDatos()) {
				resultado.setFecha(Conversiones.toTimestamp(objeto.getFecha()));
				resultado.setValor(Conversiones.toFloat(o.getValor()));
				resultado.setTagName(tagNames.stream().filter(x -> o.getId().equals(x.getIdPlc())).map(TagDictionary::getTagname)
						.findAny().orElse(""));
				resultados.add(resultado);
				resultado=new TResultado();
			}
			// Save de los resultados
			tResultado_dao.cargarResultados(resultados);
			
			return true;
		} catch (Exception e) {
			log.info(e.getMessage());
			return false;
		}
	}

	
}
