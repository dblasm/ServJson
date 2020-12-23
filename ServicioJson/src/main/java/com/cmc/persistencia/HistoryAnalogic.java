package com.cmc.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigInteger;
import java.sql.Timestamp;


@Entity
@Table(name = "historyanalogic")
public class HistoryAnalogic {
	
	@Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
	@Column(name = "id")
	private BigInteger id;
	@Column(name = "fecha", nullable = false)
	private Timestamp fecha; 
	@Column(name = "valor", nullable = false)
	private Float valor;
	@Column(name = "tagname", nullable = false)
	private String tagName; 


	
	// Constructores
	public HistoryAnalogic() {
	}
	
	public HistoryAnalogic(BigInteger id, Timestamp fecha, Float valor, String tagName) {
		super();
		this.id = id;
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

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TResultado [id=" + id + ", fecha=" + fecha + ", valor=" + valor + ", tagName=" + tagName + "]";
	}

}
