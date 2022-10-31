package proyectobd.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "empleado")
public class Empleado {

	@GenericGenerator(name = "ID_EMPLEADO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq6"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_EMPLEADO")
	@GeneratedValue(generator = "ID_EMPLEADO")
	private Integer id_empleado;

	@Column(name = "ID_TIPO_USUARIO")
	private Integer tipo_usuario;

	@Column(name = "IDPERSONA")
	private Integer id_persona;

	@Column(name = "FECHA_INGRESO")
	private String fecha_ingreso;

	@Column(name = "FECHA_EGRESO")
	private String fecha_egreso;

	@Column(name = "USUARIO_EMPLEADO")
	private String usuario_empleado;

	@Column(name = "NOMBRE_ROL")
	private String nombrerol;

	public Integer getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}

	public Integer getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(Integer tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public Integer getId_persona() {
		return id_persona;
	}

	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getFecha_egreso() {
		return fecha_egreso;
	}

	public void setFecha_egreso(String fecha_egreso) {
		this.fecha_egreso = fecha_egreso;
	}

	public String getUsuario_empleado() {
		return usuario_empleado;
	}

	public void setUsuario_empleado(String usuario_empleado) {
		this.usuario_empleado = usuario_empleado;
	}

	public String getNombrerol() {
		return nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

}
