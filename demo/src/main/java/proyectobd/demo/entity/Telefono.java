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
@Table(name = "telefono")
public class Telefono  implements Serializable {

	private static final long serialVersionUID = 2L;

	@GenericGenerator(name = "IDTELEFONO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq19"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDTELEFONO")
	@GeneratedValue(generator = "IDTELEFONO")
	private Integer idtelefono;

	@Column(name = "IDCLIENTE")
	private Integer idcliente;

	@Column(name = "IDPERSONA")
	private Integer idpersona;

	@Column(name = "NUMERO")
	private Integer numero;



	public Integer getIdtelefono() {
		return idtelefono;
	}



	public void setIdtelefono(Integer idtelefono) {
		this.idtelefono = idtelefono;
	}



	public Integer getIdcliente() {
		return idcliente;
	}



	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}



	public Integer getIdpersona() {
		return idpersona;
	}



	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
