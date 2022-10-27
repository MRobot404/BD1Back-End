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
	@Parameter(name = "sequence_name", value = "test_seq"), @Parameter(name = "initial_value", value = "1"),
	@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "ID_MENU")
	@GeneratedValue(generator = "ID_MENU")
	private Integer id_menu;

	@Column(name = "OPCION_MENU")
	private String opcion_menu;

	public Integer getId_menu() {
		return id_menu;
	}

	public void setId_menu(Integer id_menu) {
		this.id_menu = id_menu;
	}

	public String getOpcion_menu() {
		return opcion_menu;
	}

	public void setOpcion_menu(String opcion_menu) {
		this.opcion_menu = opcion_menu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
