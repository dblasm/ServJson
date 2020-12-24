package com.cmc.objetos;

public class Response {
	
	private String contenedor;
	private String fecha;
	private String descripcion;
	
	

	public Response(String contenedor, String fecha, String descripcion) {
		super();
		this.contenedor = contenedor;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}
	
	

	public String getContenedor() {
		return contenedor;
	}



	public void setContenedor(String contenedor) {
		this.contenedor = contenedor;
	}



	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Response [contenedor=" + contenedor + ", fecha=" + fecha + ", descripcion=" + descripcion + "]";
	}
	
	

}
