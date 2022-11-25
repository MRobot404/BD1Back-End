package proyectobd.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "renta")
public class Renta implements Serializable{
	
	private static final long serialVersionUID = 1L;


	   @GenericGenerator(name = "IDRENTA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	    @Parameter(name = "sequence_name", value = "test_seq14"),
	    @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	    @Parameter(name = "schema", value = "SYSTEM") })


	   	@Id
	    @Basic(optional = false)
	    @Column(name = "IDRENTA")
	    @GeneratedValue(generator = "IDRENTA")
	    private Integer id_renta;
	   
	   
	   @Column(name = "IDCLIENTE")
		 private  Integer id_cliente;
	   
	   
	   @Column(name = "IDESTADO_INMUEBLE")
		 private  Integer id_estado_inmueble;
	   
	   @Column(name = "IDINMUEBLE")
		 private  Integer id_inmueble;
	   
	   
	   @Column(name = "FECHA_RENTA")
		 private  String fecha_renta;
	   
	   
	   @Column(name = "TIEMPO_RENTA_RESERVA")
		 private  String tiempo_renta_reserva;
	   
	   
	   @Column(name = "VALOR")
		 private  Integer valor;
	   
	   
	   @Column(name = "FECHA_INICIO")
		 private  String fecha_inicio;
	   
	   
	   @Column(name = "FECHA_FIN")
		 private  String fecha_fin;
	   
	   
	   @Column(name = "FECHA_CANCELACION")
		 private  String fecha_cancelacion;

	   @OneToMany(mappedBy = "id_renta")
			private List<Renta_Pago> rentapagolist;
			

	public List<Renta_Pago> getRentapagolist() {
		return rentapagolist;
	}


	public void setRentapagolist(List<Renta_Pago> rentapagolist) {
		this.rentapagolist = rentapagolist;
	}


	public Integer getId_renta() {
		return id_renta;
	}


	public void setId_renta(Integer id_renta) {
		this.id_renta = id_renta;
	}


	public Integer getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
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


	public String getFecha_renta() {
		return fecha_renta;
	}


	public void setFecha_renta(String fecha_renta) {
		this.fecha_renta = fecha_renta;
	}


	public String getTiempo_renta_reserva() {
		return tiempo_renta_reserva;
	}


	public void setTiempo_renta_reserva(String tiempo_renta_reserva) {
		this.tiempo_renta_reserva = tiempo_renta_reserva;
	}


	public Integer getValor() {
		return valor;
	}


	public void setValor(Integer valor) {
		this.valor = valor;
	}


	public String getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public String getFecha_fin() {
		return fecha_fin;
	}


	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}


	public String getFecha_cancelacion() {
		return fecha_cancelacion;
	}


	public void setFecha_cancelacion(String fecha_cancelacion) {
		this.fecha_cancelacion = fecha_cancelacion;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
	   


}
