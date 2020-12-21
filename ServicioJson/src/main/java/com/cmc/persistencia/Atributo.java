package com.cmc.persistencia;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "atributo")
public class Atributo {
	
	@Id    
	@Column(name = "id", nullable = false)
	private int id; 
	@Column(name = "tipo", nullable = false)
	private String tipo; 
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
	
	@Transient
	@ManyToOne
	private Equipo equipo;
	
	
	public Atributo() {
		
	}






	public Atributo(int id, String tipo, String attrname, float escalado, boolean esEscalado, boolean agregado,
			int tiempoAgregado) {
		this.id = id;
		this.tipo = tipo;
		this.attrname = attrname;
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

		
/*
	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
*/



	




	

	


	
	
	
	
	
	
}
