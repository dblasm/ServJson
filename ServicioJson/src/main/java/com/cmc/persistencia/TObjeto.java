package com.cmc.persistencia;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "diccionario")
public class TObjeto {
	
	@Column(name = "ip", nullable = false)
	private String ip;
	@Id
	@Column(name = "id", nullable = false)
	private String id; 
	@Column(name = "tagname", nullable = false)
	private String tagName; 
	@Column(name = "idplc", nullable = false)
	private String idPlc; 
	@Column(name = "escalado", nullable = false)
	private float escalado;
	@Column(name = "es_escalado", nullable = false)
	private boolean esEscalado;
	@Column(name = "agregado", nullable = false)
	private boolean agregado; 
	@Column(name = "tiempoagregado", nullable = false)
	private int tiempoAgregado;
	
	//Constructores
		public TObjeto() {
			
		}	
		
		public TObjeto(String ip, String id, String tagName, String idPlc, float escalado, boolean esEscalado,
				boolean agregado, int tiempoAgregado) {
			super();
			this.ip = ip;
			this.id = id;
			this.tagName = tagName;
			this.idPlc = idPlc;
			this.escalado = escalado;
			this.esEscalado = esEscalado;
			this.agregado = agregado;
			this.tiempoAgregado = tiempoAgregado;
		}

	
	//Accesores
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
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getIdPlc() {
		return idPlc;
	}

	public void setidPlc(String idPlc) {
		this.idPlc = idPlc;
	}



	@Override
	public String toString() {
		return "TObjeto [ip=" + ip + ", id=" + id + ", tagName=" + tagName + ", idValor=" + idPlc + "]";
	}
	

}
