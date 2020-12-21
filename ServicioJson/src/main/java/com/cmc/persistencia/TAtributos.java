package com.cmc.persistencia;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "atributos")
public class TAtributos {
	
	@Id    
	@Column(name = "id", nullable = false)
	private String id; 
	@Column(name = "attrname", nullable = false)
	private String attrname; 	
	@Column(name = "escalado", nullable = false)
	private float escalado;
	@Column(name = "es_escalado", nullable = false)
	private boolean esEscalado;
	@Column(name = "agregado", nullable = false)
	private boolean agregado; 
	@Column(name = "tiempo_agregado", nullable = false)
	private int tiempoAgregado;
	
	@OneToMany(targetEntity = TEquipo.class, mappedBy = "tagname", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<TEquipo> equipos;
	
	
	public TAtributos() {
		
	}


	public TAtributos(String id_tipo, String idPlc, float escalado, boolean esEscalado, boolean agregado, int tiempoAgregado,
			Set<TEquipo> equipos) {
		this.id = id_tipo;
		this.attrname = idPlc;
		this.escalado = escalado;
		this.esEscalado = esEscalado;
		this.agregado = agregado;
		this.tiempoAgregado = tiempoAgregado;
		this.equipos = equipos;
	}


	public String getId_tipo() {
		return id;
	}


	public void setId_tipo(String id_tipo) {
		this.id = id_tipo;
	}


	public String getIdPlc() {
		return attrname;
	}


	public void setIdPlc(String idPlc) {
		this.attrname = idPlc;
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

	
	public Set<TEquipo> getEquipos() {
		return equipos;
	}


	public void setEquipos(Set<TEquipo> equipos) {
		this.equipos = equipos;
	}


	@Override
	public String toString() {
		return "TTipo [id_tipo=" + id + ", idPlc=" + attrname + ", escalado=" + escalado + ", esEscalado="
				+ esEscalado + ", agregado=" + agregado + ", tiempoAgregado=" + tiempoAgregado + ", equipos=" + equipos
				+ "]";
	}


	


	
	
	
	
	
	
}
