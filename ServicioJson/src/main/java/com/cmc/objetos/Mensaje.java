package com.cmc.objetos;

public class Mensaje {
	
	
	private String ip;
	private String fecha;
	private String info;
	private Boolean estado;
	
	public Mensaje(String ip, String fecha, String info, Boolean estado) {
		super();
		this.ip = ip;
		this.fecha = fecha;
		this.info = info;
		this.estado = estado;
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Mensaje [ip=" + ip + ", fecha=" + fecha + ", info=" + info + ", estado=" + estado + "]";
	}
	
		

}
