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
@Table(name = "persona")
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@GenericGenerator(name = "IDPERSONA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	@Parameter(name = "sequence_name", value = "test_seq12"),
	@Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	@Parameter(name = "schema", value = "SYSTEM") })
	
	@Id
    @Basic(optional = false)
    @Column(name = "IDPERSONA")
    @GeneratedValue(generator = "IDPERSONA")
    private Integer idpersona;
	
	@Column(name = "NOMBRE")
	 private  String nombre;
	
	
	@Column(name = "APELLIDO")
	 private  String apellido;
	
	
	@Column(name = "FECHA_NACIMIENTO")
	 private  String fechanacimiento;
	
	@OneToMany(mappedBy = "idpersona")
	private List<Telefono> telefonolist;
	
	@OneToMany(mappedBy = "id_persona")
	private List<Correo> correolist;
	
	@OneToMany(mappedBy = "id_persona")
	private List<Empleado> empleadolist;
	
	@OneToMany(mappedBy = "id_persona")
	private List<Cliente> clientelist;
	
	@OneToMany(mappedBy = "id_persona")
	private List<Documento_Persona> documento_personalist;

	
	public List<Empleado> getEmpleadolist() {
		return empleadolist;
	}

	public void setEmpleadolist(List<Empleado> empleadolist) {
		this.empleadolist = empleadolist;
	}

	public List<Cliente> getClientelist() {
		return clientelist;
	}

	public void setClientelist(List<Cliente> clientelist) {
		this.clientelist = clientelist;
	}

	public List<Documento_Persona> getDocumento_personalist() {
		return documento_personalist;
	}

	public void setDocumento_personalist(List<Documento_Persona> documento_personalist) {
		this.documento_personalist = documento_personalist;
	}

	public List<Correo> getCorreolist() {
		return correolist;
	}

	public void setCorreolist(List<Correo> correolist) {
		this.correolist = correolist;
	}

	public List<Telefono> getTelefonolist() {
		return telefonolist;
	}

	public void setTelefonolist(List<Telefono> telefonolist) {
		this.telefonolist = telefonolist;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
