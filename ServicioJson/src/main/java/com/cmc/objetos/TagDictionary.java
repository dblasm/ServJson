package com.cmc.objetos;



public class TagDictionary {

	private String tagname;
	private String idPlc;
	
	public TagDictionary(String tagname, String idPlc) {
		super();
		this.tagname = tagname;
		this.idPlc = idPlc;
	}	
	
	public TagDictionary() {
		super();
		
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
