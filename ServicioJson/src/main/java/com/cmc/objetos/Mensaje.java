package com.cmc.objetos;

public class Mensaje {
	
	private int id;
	private String ip;
	private String info;
	private Boolean estado;
	
	public Mensaje(int id,String ip, String info, Boolean estado) {
		super();
		this.id = id;
		this.ip = ip;
		this.info = info;
		this.estado = estado;
	}	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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
		return "Mensaje [id=" + id + ", ip=" + ip + ", info=" + info + ", estado=" + estado + "]";
	}	
	
	

}
