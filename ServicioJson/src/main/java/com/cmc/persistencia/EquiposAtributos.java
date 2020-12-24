package com.cmc.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class EquiposAtributos {	
	
	//Equipos	
	@Column (name = "id")
	private int id;
	@Id
	@Column (name = "tagname")
	private String tagname;
	@Column (name = "ip")
	private String ip;
	@Column (name = "tipo")
	private String tipo;
	@Column (name = "escalado")
	private float escalado;
	@Column (name = "es_escalado")
	private boolean esEscalado;	
	@Column (name = "agregado")
	private boolean agregado; 
	@Column (name = "tiempo_agregado")
	private int tiempoAgregado;
	
	
	
	public EquiposAtributos() {		
		
	}
	
	

	public EquiposAtributos(int id, String tagname, String ip, String tipo, float escalado,
			boolean esEscalado, boolean agregado, int tiempoAgregado) {
		super();
		this.id = id;
		this.tagname = tagname;
		this.ip = ip;
		this.tipo = tipo;		
		this.escalado = escalado;
		this.esEscalado = esEscalado;
		this.agregado = agregado;
		this.tiempoAgregado = tiempoAgregado;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getEscalado() {
		return escalado;
	}
	public void setEscalado(float escalado) {
		this.escalado = escalado;
	}
	public boolean isEsEscalado() {
		return esEscalado;
	}
	public void setEsEscalado(boolean esEscalado) {
		this.esEscalado = esEscalado;
	}
	public boolean isAgregado() {
		return agregado;
	}
	public void setAgregado(boolean agregado) {
		this.agregado = agregado;
	}
	public int getTiempoAgregado() {
		return tiempoAgregado;
	}
	public void setTiempoAgregado(int tiempoAgregado) {
		this.tiempoAgregado = tiempoAgregado;
	}



	@Override
	public String toString() {
		return "EquiposAtributos [id=" + id + ", tagname=" + tagname + ", ip=" + ip + ", tipo=" + tipo  + ", escalado=" + escalado + ", esEscalado=" + esEscalado + ", agregado=" + agregado
				+ ", tiempoAgregado=" + tiempoAgregado + "]";
	}
	
	
	
}
	
	
	