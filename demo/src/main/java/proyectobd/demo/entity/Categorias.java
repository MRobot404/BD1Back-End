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
@Table(name = "categorias")
public class Categorias implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "IDCATEGORIA", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq1"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDCATEGORIA")
	@GeneratedValue(generator = "IDCATEGORIA")
	private Integer id_categoria;

	@Column(name = "IDESTADO_INMUEBLE")
	private Integer id_estado_inmueble;

	@Column(name = "IDINMUEBLE")
	private Integer id_inmueble;

	@Column(name = "NOMBRE_CATEGORIA")
	private String nombre_categoria;

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
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

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
