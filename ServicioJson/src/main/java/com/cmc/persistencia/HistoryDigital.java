package com.cmc.persistencia;


import java.math.BigInteger;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "historydigital")
public class HistoryDigital {    
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
	@Column(name = "id")
	private BigInteger id;
	@Column(name = "fecha", nullable = false)
	private Timestamp fecha; 
	@Column(name = "valor", nullable = false)
	private Boolean valor;	
	@Column(name = "tagname", nullable = false)
	private String tagName;
	
	
	
	public HistoryDigital() {
	}

	public HistoryDigital(BigInteger id, Timestamp fecha, Boolean valor, String tagName) {
		this.id = id;
		this.fecha = fecha;
		this.valor = valor;
		this.tagName = tagName;
	}


	public BigInteger getId() {
		return id;
	}



	public void setId(BigInteger id) {
		this.id = id;
	}



	public Timestamp getFecha() {
		return fecha;
	}



	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}





	public Boolean getValor() {
		return valor;
	}



	public void setValor(Boolean valor) {
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
		return "HistoryDigital [id=" + id + ", fecha=" + fecha + ", valor=" + valor + ", tagName=" + tagName + "]";
	}
	
}
