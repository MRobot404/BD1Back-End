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
