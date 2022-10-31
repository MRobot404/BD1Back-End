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
@Table(name = "pago")
public class Pago implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "IDPAGO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq11"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDPAGO")
	@GeneratedValue(generator = "IDPAGO")
	private Integer id_pago;

	@Column(name = "ID_RESERVA_PAGO")
	private Integer id_reserva_pago;

	public Integer getId_pago() {
		return id_pago;
	}

	public void setId_pago(Integer id_pago) {
		this.id_pago = id_pago;
	}

	public Integer getId_reserva_pago() {
		return id_reserva_pago;
	}

	public void setId_reserva_pago(Integer id_reserva_pago) {
		this.id_reserva_pago = id_reserva_pago;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
