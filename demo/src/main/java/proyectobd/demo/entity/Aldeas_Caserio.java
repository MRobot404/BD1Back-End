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
@Table(name = "aldeas_caserio")
public class Aldeas_Caserio implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_ALDEA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })
	@Id
	@Basic(optional = false)
	@Column(name = "ID_ALDEA")
	@GeneratedValue(generator = "ID_ALDEA")
	private Integer id_aldea;

	@Column(name = "ID_MUNICIPIO")
	private Integer id_municipio;
	
	@Column(name = "ALDEA_CASERIO")
	private String aldea_caserio;

	public Integer getId_aldea() {
		return id_aldea;
	}

	public void setId_aldea(Integer id_aldea) {
		this.id_aldea = id_aldea;
	}

	public Integer getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getAldea_caserio() {
		return aldea_caserio;
	}

	public void setAldea_caserio(String aldea_caserio) {
		this.aldea_caserio = aldea_caserio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}