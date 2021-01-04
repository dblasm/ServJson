package com.cmc.persistencia;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "equipo")
public class Equipo {
	
	@Column(name = "ip", nullable = false)
	private String ip;
	@Id
	@Column(name = "tagname", nullable = false)
	private String tagname; 
	@Column (name = "id_tipo", nullable = false)
	private String id_tipo;
	@Column (name = "descripcion", nullable = false)
	private String descripcion;
	
	@Transient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipo")
	private Set<Atributo> atributos;
   
	
	//Constructores
		public Equipo() {
			
		}

		public Equipo(String ip, String tagname, String id_tipo, String descripcion, Set<Atributo> atributos) {
		this.ip = ip;
		this.tagname = tagname;
		this.id_tipo = id_tipo;
		this.descripcion = descripcion;
		this.atributos = atributos;
	}

		//Accesores
		public String getIp() {
			return ip;
		}


		public void setIp(String ip) {
			this.ip = ip;
		}


		public String getTagname() {
			return tagname;
		}


		public void setTagname(String tagname) {
			this.tagname = tagname;
		}


		public String getId_tipo() {
			return id_tipo;
		}


		public void setId_tipo(String id_tipo) {
			this.id_tipo = id_tipo;
		}


		public Set<Atributo> getAtributos() {
			return atributos;
		}


		public void setAtributos(Set<Atributo> atributos) {
			this.atributos = atributos;
		}


		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}	

}
