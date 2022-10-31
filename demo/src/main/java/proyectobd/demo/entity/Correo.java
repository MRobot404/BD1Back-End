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
@Table(name = "correo")
public class Correo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "IDCORREO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq3"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDCORREO")
	@GeneratedValue(generator = "IDCORREO")
	private Integer id_correo;

	@Column(name = "IDPERSONA")
	private Integer id_persona;

	@Column(name = "IDCLIENTE")
	private Integer id_cliente;

	@Column(name = "EMAIL")
	private String email;

	public Integer getId_correo() {
		return id_correo;
	}

	public void setId_correo(Integer id_correo) {
		this.id_correo = id_correo;
	}

	public Integer getId_persona() {
		return id_persona;
	}

	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
