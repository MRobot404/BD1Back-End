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
@Table(name = "municipio")
public class Municipio implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_MUNICIPIO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq10"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_MUNICIPIO")
	@GeneratedValue(generator = "ID_MUNICIPIO")
	private Integer id_municipio;

	@Column(name = "ID_DEPARTAMENTO")
	private Integer id_departamento;
	
	@Column(name = "MUNICIPIO")
	private String MUNICIPIO;

	public Integer getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}

	public Integer getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(Integer id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getMUNICIPIO() {
		return MUNICIPIO;
	}

	public void setMUNICIPIO(String mUNICIPIO) {
		MUNICIPIO = mUNICIPIO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
