package com.cmc.persistencia;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tipos")
public class TTipo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipo", nullable = false)
	private String id_tipo; 
	@Column(name = "id_plc", nullable = false)
	private String idPlc; 
	@Column(name = "escalado", nullable = false)
	private float escalado;
	@Column(name = "es_escalado", nullable = false)
	private boolean esEscalado;
	@Column(name = "agregado", nullable = false)
	private boolean agregado; 
	@Column(name = "tiempo_agregado", nullable = false)
	private int tiempoAgregado;
	
	private Set<TDato> datos;
	
	
	public TTipo() {
		
	}


	public TTipo(String id_tipo, String idPlc, float escalado, boolean esEscalado, boolean agregado, int tiempoAgregado,
			Set<TDato> datos) {
		this.id_tipo = id_tipo;
		this.idPlc = idPlc;
		this.escalado = escalado;
		this.esEscalado = esEscalado;
		this.agregado = agregado;
		this.tiempoAgregado = tiempoAgregado;
		this.datos = datos;
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

	@Transient
	@ManyToOne(cascade = CascadeType.ALL)
	public Set<TDato> getDatos() {
		return datos;
	}


	public void setDatos(Set<TDato> datos) {
		this.datos = datos;
	}


	@Override
	public String toString() {
		return "TTipo [id_tipo=" + id_tipo + ", idPlc=" + idPlc + ", escalado=" + escalado + ", esEscalado="
				+ esEscalado + ", agregado=" + agregado + ", tiempoAgregado=" + tiempoAgregado + ", datos=" + datos
				+ "]";
	}


	


	
	
	
	
	
	
}
