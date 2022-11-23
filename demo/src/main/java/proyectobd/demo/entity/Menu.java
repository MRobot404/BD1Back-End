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
@Table(name = "menu")
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_MENU", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq9"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDMENU")
	@GeneratedValue(generator = "IDMENU")
	private Integer idmenu;

	@Column(name = "OPCIONMENU")
	private String opcion;



	public Integer getIdmenu() {
		return idmenu;
	}



	public void setIdmenu(Integer idmenu) {
		this.idmenu = idmenu;
	}



	public String getOpcion() {
		return opcion;
	}



	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
