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
@Table(name = "rol")
public class Rol implements Serializable{
	
	private static final long serialVersionUID = 1L;


	   @GenericGenerator(name = "ID_ROL", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	    @Parameter(name = "sequence_name", value = "ID_ROL"),
	    @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	    @Parameter(name = "schema", value = "SYSTEM") })


	   	@Id
	    @Basic(optional = false)
	    @Column(name = "ID_ROL")
	    @GeneratedValue(generator = "ID_ROL")
	    private Integer idrol;
	   
	   
	   @Column(name = "NOMBRE_ROL")
		 private  String nombrerol;


	public Integer getIdrol() {
		return idrol;
	}


	public void setIdrol(Integer idrol) {
		this.idrol = idrol;
	}


	public String getNombrerol() {
		return nombrerol;
	}


	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
	   
	   

}
