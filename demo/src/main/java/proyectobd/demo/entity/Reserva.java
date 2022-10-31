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
@Table(name = "reserva")
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "IDRESERVA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq16"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDRESERVA")
	@GeneratedValue(generator = "IDRESERVA")
	private Integer id_reserva;

	@Column(name = "IDESTADO_INMUEBLE")
	private Integer id_estado_inmueble;

	@Column(name = "IDINMUEBLE")
	private Integer id_inmueble;

	@Column(name = "IDCLIENTE")
	private Integer id_cliente;

	@Column(name = "FECHA_RESERVA")
	private String fecha_reserva;

	@Column(name = "TIEMPO_RESERVA")
	private String tiempo_reserva;

	@Column(name = "TIEMPO_RENTA_REST")
	private String tiempo_renta_rest;

	@Column(name = "FECHA_CANCELA")
	private String fecha_cancela;

	public Integer getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(Integer id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Integer getId_estado_inmueble() {
		return id_estado_inmueble;
	}

	public void setId_estado_inmueble(Integer id_estado_inmueble) {
		this.id_estado_inmueble = id_estado_inmueble;
	}

	public Integer getId_inmueble() {
		return id_inmueble;
	}

	public void setId_inmueble(Integer id_inmueble) {
		this.id_inmueble = id_inmueble;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public String getTiempo_reserva() {
		return tiempo_reserva;
	}

	public void setTiempo_reserva(String tiempo_reserva) {
		this.tiempo_reserva = tiempo_reserva;
	}

	public String getTiempo_renta_rest() {
		return tiempo_renta_rest;
	}

	public void setTiempo_renta_rest(String tiempo_renta_rest) {
		this.tiempo_renta_rest = tiempo_renta_rest;
	}

	public String getFecha_cancela() {
		return fecha_cancela;
	}

	public void setFecha_cancela(String fecha_cancela) {
		this.fecha_cancela = fecha_cancela;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
