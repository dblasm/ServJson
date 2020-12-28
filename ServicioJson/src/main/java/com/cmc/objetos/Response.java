
package com.cmc.objetos;


import java.util.ArrayList;
import java.util.List;


public class Response {	
	
	private String fecha;	
	private List<Mensaje> datos;	

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(String fecha,List<Mensaje> data) {
		super();		
		this.fecha = fecha;		
		this.datos = data;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	

	public List<Mensaje> getDatos() {
		return datos;
	}


	public void setDatos(List<Mensaje> datos) {
		this.datos = datos;
	}


	@Override
	public String toString() {
		return "Response [ fecha=" + fecha +  ", datos=" + datos + "]";
	}
	
	public void modificar(String ip,String fecha, String info, Boolean estado) {
		
		boolean find = false;
		ip = ip.replace(".", "_");
		
		if (getDatos() !=null) {
		
				for (Mensaje m : getDatos()) {
					
					if (m.getIp()==ip) {				
						
						m.setFecha(fecha);
						m.setInfo(info);
						m.setEstado(estado);
						find = true;
					}
				}
				
				if (!find) {
					List<Mensaje> dt = getDatos();
					dt.add(new Mensaje(ip,fecha,info,estado));
					setDatos(dt);
				}
				
		}else {
			
			List<Mensaje> dt = new ArrayList<Mensaje>();
			dt.add(new Mensaje(ip,fecha,info,estado));
			setDatos(dt);
		}
		
		
	}
	

}


