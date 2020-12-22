package com.cmc.objetos;



public class TagDictionary {

	private String tagname;
	private String attrname;
	private float escalado;
	private boolean esEscalado;
	private boolean agregado;
	private int tiempoAgregado;
	
	public TagDictionary() {
		super();
		
	}
	
	public TagDictionary(String tagname, String attrname, float escalado, boolean esEscalado, boolean agregado,
			int tiempoAgregado) {
		super();
		this.tagname = tagname;
		this.attrname = attrname;
		this.escalado = escalado;
		this.esEscalado = esEscalado;
		this.agregado = agregado;
		this.tiempoAgregado = tiempoAgregado;
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
	public String getAttrname() {
		return attrname;
	}
	public void setAttrname(String attrname) {
		this.attrname = attrname;
	}

	@Override
	public String toString() {
		return "TagDictionary [tagname=" + tagname + ", attrname=" + attrname + ", escalado=" + escalado
				+ ", esEscalado=" + esEscalado + ", agregado=" + agregado + ", tiempoAgregado=" + tiempoAgregado + "]";
	}



}
