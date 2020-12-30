package com.cmc.objetos;



public class DatoDigital {

	private String valor;
	private String id;
	private String fecha;

	// Constructores
	public DatoDigital() {
	
	}

	public DatoDigital(String valor, String id, String fecha) {
		this.valor = valor;
		this.id = id;
		this.fecha = fecha;
	}

	
	//Accesores
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	
	@Override
	public String toString() {
		return "DatoDigital [valor=" + valor + ", id=" + id + ", fecha=" + fecha + "]";
	}

}
