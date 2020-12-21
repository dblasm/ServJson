package com.cmc.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipos_atributos")
public class EquiposAtributos {	
	//Equipos
	private String ip;
	@Column (name = "tagname")
	private String tagname; 	
	
	//Comun
	@Id
	@Column (name = "id_tipo")
	private String id_tipo;
	
	//Atributos		
	@Column (name = "id_plc")
	private String idPlc;
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
	public EquiposAtributos(String ip, String tagname, String id_tipo, String idPlc, float escalado, boolean esEscalado,
			boolean agregado, int tiempoAgregado) {
		super();
		this.ip = ip;
		this.tagname = tagname;
		this.id_tipo = id_tipo;
		this.idPlc = idPlc;
		this.escalado = escalado;
		this.esEscalado = esEscalado;
		this.agregado = agregado;
		this.tiempoAgregado = tiempoAgregado;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	public String getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(String id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getIdPlc() {
		return idPlc;
	}
	public void setIdPlc(String idPlc) {
		this.idPlc = idPlc;
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
		return "EquiposAtributos [ip=" + ip + ", tagname=" + tagname + ", id_tipo=" + id_tipo + ", idPlc=" + idPlc
				+ ", escalado=" + escalado + ", esEscalado=" + esEscalado + ", agregado=" + agregado
				+ ", tiempoAgregado=" + tiempoAgregado + "]";
	}
	
	

}
