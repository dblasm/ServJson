package com.cmc.persistencia;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "equipos")
public class TEquipo {
	
	@Column(name = "ip", nullable = false)
	private String ip;
	@Id
	@Column(name = "tagname", nullable = false)
	private String tagname; 
	@Column (name = "id_tipo", nullable = false)
	private String id_tipo;
	@Column (name = "descripcion", nullable = false)
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo", insertable = false, updatable = false)
	@Fetch(value = FetchMode.JOIN)
	private TAtributos atributos;
   
	
	//Constructores
		public TEquipo() {
			
		}
		

		public TEquipo(String ip, String tagname, String id_tipo, TAtributos atributos,String descripcion) {
		super();
		this.ip = ip;
		this.tagname = tagname;
		this.id_tipo = id_tipo;
		this.atributos = atributos;
		this.descripcion = descripcion;
		
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


		public TAtributos getAtributos() {
			return atributos;
		}



		public void setAtributos(TAtributos atributos) {
			this.atributos = atributos;
		}	


		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}


		@Override
		public String toString() {
			return "TEquipo [ip=" + ip + ", tagname=" + tagname + ", id_tipo=" + id_tipo + ", atributos=" + atributos
					+ "]";
		}
		
		
	

}
