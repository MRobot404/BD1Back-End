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
@Table(name = "rol_tipo_usuario")
public class Rol_Tipo_Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;


	   @GenericGenerator(name = "ID_ROL_TIPO_USUARIO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	    @Parameter(name = "sequence_name", value = "test_seq"),
	    @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	    @Parameter(name = "schema", value = "SYSTEM") })


	   	@Id
	    @Basic(optional = false)
	    @Column(name = "ID_ROL_TIPO_USUARIO")
	    @GeneratedValue(generator = "ID_ROL_TIPO_USUARIO")
	    private Integer id_rol_tipo_usuario;
	   
	   
	   @Column(name = "ID_ROL")
		 private  Integer id_rol;
	   
	   @Column(name = "ID_TIPO_USUARIO")
		 private  Integer id_tipo_usuario;

	public Integer getId_rol_tipo_usuario() {
		return id_rol_tipo_usuario;
	}

	public void setId_rol_tipo_usuario(Integer id_rol_tipo_usuario) {
		this.id_rol_tipo_usuario = id_rol_tipo_usuario;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public Integer getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(Integer id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
	   
	   

}
