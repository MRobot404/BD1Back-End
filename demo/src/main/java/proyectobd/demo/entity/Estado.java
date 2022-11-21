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
@Table(name = "estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "IDESTADO_INMUEBLE", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq7"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDESTADO_INMUEBLE")
	@GeneratedValue(generator = "IDESTADO_INMUEBLE")
	private Integer id_estado_inmueble;

	@Column(name = "DISPONIBILIDAD")
	private String disponiblidad;

	public Integer getId_estado_inmueble() {
		return id_estado_inmueble;
	}

	public void setId_estado_inmueble(Integer id_estado_inmueble) {
		this.id_estado_inmueble = id_estado_inmueble;
	}



	public String getDisponiblidad() {
		return disponiblidad;
	}

	public void setDisponiblidad(String disponiblidad) {
		this.disponiblidad = disponiblidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
