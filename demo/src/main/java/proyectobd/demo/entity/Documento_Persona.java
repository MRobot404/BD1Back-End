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
@Table(name = "documento_persona")
public class Documento_Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_DOCUMENTO_PERSONA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_DOCUMENTO_PERSONA")
	@GeneratedValue(generator = "ID_DOCUMENTO_PERSONA")
	private Integer id_documento_persona;

	@Column(name = "ID_TIPOPERSONA")
	private Integer id_tipo_persona;

	@Column(name = "IDPERSONA")
	private Integer id_persona;

	public Integer getId_documento_persona() {
		return id_documento_persona;
	}

	public void setId_documento_persona(Integer id_documento_persona) {
		this.id_documento_persona = id_documento_persona;
	}

	public Integer getId_tipo_persona() {
		return id_tipo_persona;
	}

	public void setId_tipo_persona(Integer id_tipo_persona) {
		this.id_tipo_persona = id_tipo_persona;
	}

	public Integer getId_persona() {
		return id_persona;
	}

	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
