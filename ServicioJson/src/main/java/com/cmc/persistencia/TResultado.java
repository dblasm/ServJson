package com.cmc.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "secundaria")
public class TResultado {
	
	@Id
	@Column(name = "fecha", nullable = false)
	private Timestamp fecha; 
	@Column(name = "valor", nullable = false)
	private Float valor;
	@Column(name = "tagname", nullable = false)
	private String tagName; 


	
	// Constructores
	public TResultado() {
	}
	
	public TResultado(Timestamp fecha, Float valor, String tagName) {
		this.fecha = fecha;
		this.valor = valor;
		this.tagName = tagName;
	}
	
	// Accesores
	
	
	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	
	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public String toString() {
		return "TResultado [fecha=" + fecha + ", valor=" + valor + ", tagName=" + tagName + "]";
	}

}
