package com.cmc.objetos;



public class TagDictionary {

	private String tagname;
	private String idPlc;
	private float escalado;
	private boolean esEscalado;
	private boolean agregado;
	private int tiempoAgregado;
	
	public TagDictionary() {
		super();
		
	}
	
	public TagDictionary(String tagname, String idPlc, float escalado, boolean esEscalado, boolean agregado,
			int tiempoAgregado) {
		super();
		this.tagname = tagname;
		this.idPlc = idPlc;
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
	public String getIdPlc() {
		return idPlc;
	}
	public void setIdPlc(String idPlc) {
		this.idPlc = idPlc;
	}

	@Override
	public String toString() {
		return "TagDictionary [tagname=" + tagname + ", idPlc=" + idPlc + "]";
	}

}
