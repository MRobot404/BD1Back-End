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
@Table(name = "tipo_documento")
public class Tipo_Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_TIPOPERSONA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq20"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_TIPOPERSONA")
	@GeneratedValue(generator = "ID_TIPOPERSONA")
	private Integer id_tipo_persona;

	@Column(name = "NACIONALIDAD")
	private String nacionalidad;

	@Column(name = "PASAPORTE")
	private String pasaporte;

	@Column(name = "LICENCIA")
	private String licencia;

	public Integer getId_tipo_persona() {
		return id_tipo_persona;
	}

	public void setId_tipo_persona(Integer id_tipo_persona) {
		this.id_tipo_persona = id_tipo_persona;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
