package com.cmc.objetos;

import java.util.Set;

public class JSHistoryDigital {
	
	private String ip;
	private String fecha;
	private Set<DatoDigital> datos;
	
	
	public JSHistoryDigital() {
	}

	public JSHistoryDigital(String ip, String fecha, Set<DatoDigital> datos) {
		this.ip = ip;
		this.fecha = fecha;
		this.datos = datos;
	}

	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Set<DatoDigital> getDatos() {
		return datos;
	}

	public void setDatos(Set<DatoDigital> datos) {
		this.datos = datos;
	}


	@Override
	public String toString() {
		return "JSHistoryDigital [ip=" + ip + ", fecha=" + fecha + ", datos=" + datos + "]";
	}

}
