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
@Table(name = "renta_pago")
public class Renta_Pago implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_RENTAPAGO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_RENTAPAGO")
	@GeneratedValue(generator = "ID_RENTAPAGO")
	private Integer id_renta_pago;
	
	@Column(name = "IDPAGO")
	 private  Integer id_pago;
	
	@Column(name = "IDRENTA")
	 private  Integer id_renta;

	public Integer getId_renta_pago() {
		return id_renta_pago;
	}

	public void setId_renta_pago(Integer id_renta_pago) {
		this.id_renta_pago = id_renta_pago;
	}

	public Integer getId_pago() {
		return id_pago;
	}

	public void setId_pago(Integer id_pago) {
		this.id_pago = id_pago;
	}

	public Integer getId_renta() {
		return id_renta;
	}

	public void setId_renta(Integer id_renta) {
		this.id_renta = id_renta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
