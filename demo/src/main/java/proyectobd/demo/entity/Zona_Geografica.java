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
@Table(name = "zona_geografica")
public class Zona_Geografica implements Serializable{

	private static final long serialVersionUID = 1L;


	   @GenericGenerator(name = "IDZONAGEOGRAFICA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	    @Parameter(name = "sequence_name", value = "test_seq22"),
	    @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	    @Parameter(name = "schema", value = "SYSTEM") })


	   	@Id
	    @Basic(optional = false)
	    @Column(name = "IDZONAGEOGRAFICA")
	    @GeneratedValue(generator = "IDZONAGEOGRAFICA")
	    private Integer id_zona_geografica;
	   
	   
	   @Column(name = "IDINMUEBLE")
		 private  Integer id_inmueble;
	   
	   @Column(name = "ID_COLONIAS")
		 private  Integer id_colonias;

	   
	   @Column(name = "ID_MUNICIPIO")
		 private  Integer id_municipio;

	   
	   @Column(name = "ID_ALDEA")
		 private  Integer id_aldea;


	public Integer getId_zona_geografica() {
		return id_zona_geografica;
	}


	public void setId_zona_geografica(Integer id_zona_geografica) {
		this.id_zona_geografica = id_zona_geografica;
	}


	public Integer getId_inmueble() {
		return id_inmueble;
	}


	public void setId_inmueble(Integer id_inmueble) {
		this.id_inmueble = id_inmueble;
	}


	public Integer getId_colonias() {
		return id_colonias;
	}


	public void setId_colonias(Integer id_colonias) {
		this.id_colonias = id_colonias;
	}


	public Integer getId_municipio() {
		return id_municipio;
	}


	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}


	public Integer getId_aldea() {
		return id_aldea;
	}


	public void setId_aldea(Integer id_aldea) {
		this.id_aldea = id_aldea;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	   

}
