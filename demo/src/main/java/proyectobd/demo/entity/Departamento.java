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
@Table(name = "departamento")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_DEPARTAMENTO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_DEPARTAMENTO")
	@GeneratedValue(generator = "ID_DEPARTAMENTO")
	private Integer id_departamento;

	@Column(name = "IDINMUEBLE")
	private Integer id_inmueble;

	@Column(name = "DEPARTAMENTO")
	private String departamneto;

	public Integer getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(Integer id_departamento) {
		this.id_departamento = id_departamento;
	}

	public Integer getId_inmueble() {
		return id_inmueble;
	}

	public void setId_inmueble(Integer id_inmueble) {
		this.id_inmueble = id_inmueble;
	}

	public String getDepartamneto() {
		return departamneto;
	}

	public void setDepartamneto(String departamneto) {
		this.departamneto = departamneto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
