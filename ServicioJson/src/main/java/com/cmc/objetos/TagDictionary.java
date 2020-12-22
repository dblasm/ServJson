package com.cmc.objetos;



public class TagDictionary {

	private int id;
	private String tagname;	
	private float escalado;
	private boolean esEscalado;
	private boolean agregado;
	private int tiempoAgregado;
	
	public TagDictionary() {
		super();
		
	}	

	public TagDictionary(int id, String tagname, float escalado, boolean esEscalado, boolean agregado,
			int tiempoAgregado) {
		super();
		this.id = id;
		this.tagname = tagname;		
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
	
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}


	@Override
	public String toString() {
		return "TagDictionary [id=" + id + ", tagname=" + tagname + ", escalado=" + escalado
				+ ", esEscalado=" + esEscalado + ", agregado=" + agregado + ", tiempoAgregado=" + tiempoAgregado + "]";
	}

	



}
