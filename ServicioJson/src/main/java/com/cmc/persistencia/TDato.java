package com.cmc.persistencia;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;




@Entity
@Table(name = "datos")
public class TDato {
	
	@Column(name = "ip", nullable = false)
	private String ip;
	@Id
	@Column(name = "id", nullable = false)
	private String id; 
	@Column (name = "id_tipo", nullable = false)
	private String id_tipo;
	@Column(name = "tagname", nullable = false)
	private String tagName; 
	
	
	private TTipo tipo;
	
	//Constructores
		public TDato() {
			
		}



		public TDato(String ip, String id, String id_tipo, String tagName, TTipo tipo) {
			
			this.ip = ip;
			this.id = id;
			this.id_tipo = id_tipo;
			this.tagName = tagName;
			this.tipo = tipo;
		}



		//Accesores
		public String getIp() {
			return ip;
		}


		public void setIp(String ip) {
			this.ip = ip;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getId_tipo() {
			return id_tipo;
		}


		public void setId_tipo(String id_tipo) {
			this.id_tipo = id_tipo;
		}


		public String getTagName() {
			return tagName;
		}


		public void setTagName(String tagName) {
			this.tagName = tagName;
		}


		@Transient
	    @OneToMany(mappedBy = "tipos")
	    @JoinColumn(name = "id_tipo")
		public TTipo getTipo() {
			return tipo;
		}



		public void setTipo(TTipo tipo) {
			this.tipo = tipo;
		}



		@Override
		public String toString() {
			return "TDato [ip=" + ip + ", id=" + id + ", id_tipo=" + id_tipo + ", tagName=" + tagName + ", tipo=" + tipo
					+ "]";
		}	
		
		
	

}
