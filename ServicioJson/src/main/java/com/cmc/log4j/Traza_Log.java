package com.cmc.log4j;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Traza_Log implements ITraza_Log{
	
	/**
	 * Registro de la clasa en el sistema log4j.
	 */
	private static final Logger log= LogManager.getLogger(Traza_Log.class);
	
	/**
	 * Objeto que relaciona los mensajes personalizados para las trazas log4j.
	 */
	private static ResourceBundle rb;

	/**
	 * Sobrecarga método para indicar nivel INFO por defecto
	 * @param mensaje
	 * 			Texto a registrar
	 */
	public static void registro(String mensaje) {
		registro(mensaje, LOG_INFO);
	}
	
	/**
	 * Sobrecarga añadiendo uso de cadenas y variables en tiempo de ejecución
	 * @param clave
	 * 			Clave del properties.
	 * @param nivel
	 * 			Nivel con el que se va a mostrar el mensaje.
	 * @param valores
	 * 			Valores para las variables en los mensajes.
	 */
	public static void registro (String clave, int nivel, String valores[]) {
		if (rb == null) {
			rb = ResourceBundle.getBundle("com.cmc.log4j.textos_trazas");
		}
		String mensa = rb.getString(clave);
		mensa = MessageFormat.format(mensa, (Object[]) valores);
		registro(mensa, nivel);
	}
	
	/**
	 * Sobrecarga del método {@link #registro(String, int, String[])} Por defecto nivel INFO.
	 * @param mensaje
	 * 			Texto del mensaje a tratar.
	 * @param valores
	 * 			Valores para las variables en los mensajes.
	 */
	public static void registro (String mensaje, String valores[]) {
		if (rb == null) {
			rb = ResourceBundle.getBundle("com.cmc.log4j.textos_trazas");
		}
		String mensa = rb.getString(mensaje);
		mensa = MessageFormat.format(mensa, (Object[]) valores);
		registro(mensa, LOG_INFO);
	}
	
	
	/**
	 * Proceso de escritura mediante el sistema log4j.
	 * @param mensaje
	 * 			Texto del mensaje a tratar.
	 * @param nivel
	 * 			Prioridad dentro del sistema log4j.
	 */			
	public static void registro (String mensaje, int nivel) {
		if (nivel== LOG_TRACE) {
			if (log.isTraceEnabled()) {
				log.trace(mensaje);
			}
		}
		if (nivel== LOG_DEBUG) {
			if (log.isDebugEnabled()) {
				log.debug(mensaje);
			}
		}
		if (nivel== LOG_INFO) {
			if (log.isInfoEnabled()) {
				log.info(mensaje);
			}
		}
		if (nivel== LOG_WARNING) {
			if (log.isWarnEnabled()) {
				log.warn(mensaje);
			}
		}
		if (nivel== LOG_ERROR) {
			if (log.isErrorEnabled()) {
				log.error(mensaje);
			}
		}
		if (nivel== LOG_FATAL) {
			if (log.isFatalEnabled()) {
				log.fatal(mensaje);
			}
		}
		
	}

	
}
