package proyectobd.demo.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "zona")
public class Zona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	   @GenericGenerator(name = "ID_ZONA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	    @Parameter(name = "sequence_name", value = "test_seq"),
	    @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	    @Parameter(name = "schema", value = "SYSTEM") })


	   	@Id
	    @Basic(optional = false)
	    @Column(name = "ID_ZONA")
	    @GeneratedValue(generator = "ID_ZONA")
	    private Integer id_zona;
	   
	   
	   @Column(name = "ID_MUNICIPIO")
		 private  Integer id_municipio;
	   

	   @Column(name = "ZONA")
		 private  String zona;


	public Integer getId_zona() {
		return id_zona;
	}


	public void setId_zona(Integer id_zona) {
		this.id_zona = id_zona;
	}


	public Integer getId_municipio() {
		return id_municipio;
	}


	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
	   

}
