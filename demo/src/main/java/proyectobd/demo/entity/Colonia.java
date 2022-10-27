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
@Table(name = "colonia")
public class Colonia implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_COLONIAS", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_COLONIAS")
	@GeneratedValue(generator = "ID_COLONIAS")
	private Integer id_colonias;

	@Column(name = "ID_ZONA")
	private Integer id_zona;

	@Column(name = "NOM_COLONIAS")
	private Integer nom_colonias;

	public Integer getId_colonias() {
		return id_colonias;
	}

	public void setId_colonias(Integer id_colonias) {
		this.id_colonias = id_colonias;
	}

	public Integer getId_zona() {
		return id_zona;
	}

	public void setId_zona(Integer id_zona) {
		this.id_zona = id_zona;
	}

	public Integer getNom_colonias() {
		return nom_colonias;
	}

	public void setNom_colonias(Integer nom_colonias) {
		this.nom_colonias = nom_colonias;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
