package com.cmc.objetos;


import java.util.List;


public class Response {	
	
	private String fecha;
	private String descripcion;
	private List<Mensaje> datos;
	

	public Response(String fecha, String descripcion,List<Mensaje> data) {
		super();		
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.datos = data;
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


	public List<Mensaje> getDatos() {
		return datos;
	}


	public void setDatos(List<Mensaje> datos) {
		this.datos = datos;
	}


	@Override
	public String toString() {
		return "Response [ fecha=" + fecha + ", descripcion=" + descripcion + ", datos="
				+ datos + "]";
	}		
	

}
