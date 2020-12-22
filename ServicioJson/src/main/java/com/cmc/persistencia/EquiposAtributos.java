package com.cmc.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="equipos_atributos")
@Immutable
public class EquiposAtributos {	
	//Equipos
	@Id
	@Column (name = "tagname")
	private String tagname;
	@Column (name = "ip")
	private String ip;
	@Column (name = "tipo")
	private String tipo; 	
	@Column (name = "attrname")
	private String attrname;
	@Column (name = "escalado")
	private float escalado;
	@Column (name = "es_escalado")
	private boolean esEscalado;	
	@Column (name = "agregado")
	private boolean agregado; 
	@Column (name = "tiempo_agregado")
	private int tiempoAgregado;
	
	
	
	public EquiposAtributos() {
		super();
		
	}
	public EquiposAtributos(String tagname,String ip ,String tipo, String attrname, float escalado, boolean esEscalado,
			boolean agregado, int tiempoAgregado) {
		this.tagname = tagname;
		this.ip = ip;
		this.tipo = tipo;
		this.attrname = attrname;
		this.escalado = escalado;
		this.esEscalado = esEscalado;
		this.agregado = agregado;
		this.tiempoAgregado = tiempoAgregado;
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
	public String getAttrname() {
		return attrname;
	}
	public void setAttrname(String attrname) {
		this.attrname = attrname;
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
		return "EquiposAtributos [tagname=" + tagname + ", ip=" + ip + ", tipo=" + tipo + ", attrname=" + attrname
				+ ", escalado=" + escalado + ", esEscalado=" + esEscalado + ", agregado=" + agregado
				+ ", tiempoAgregado=" + tiempoAgregado + "]";
	}
	
	
}
	
	
	