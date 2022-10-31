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
@Table(name = "inmueble")
public class Inmueble implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "IDINMUEBLE", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "test_seq8"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

	@Id
	@Basic(optional = false)
	@Column(name = "IDINMUEBLE")
	@GeneratedValue(generator = "IDINMUEBLE")
	private Integer id_inmueble;

	@Column(name = "IDESTADO_INMUEBLE")
	private Integer id_estado_inmueble;

	@Column(name = "IDCATEGORIA")
	private Integer id_categoria;

	@Column(name = "CAT_IDCATEGORIA")
	private Integer cat_id_categoria;

	@Column(name = "NOMBRE_INMUEBLE")
	private String nombre_inmueble;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "CAPACIDAD")
	private Integer capacidad;

	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "URL_IMAGEN")
	private String url_imagen;

	public Integer getId_inmueble() {
		return id_inmueble;
	}

	public void setId_inmueble(Integer id_inmueble) {
		this.id_inmueble = id_inmueble;
	}

	public Integer getId_estado_inmueble() {
		return id_estado_inmueble;
	}

	public void setId_estado_inmueble(Integer id_estado_inmueble) {
		this.id_estado_inmueble = id_estado_inmueble;
	}

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Integer getCat_id_categoria() {
		return cat_id_categoria;
	}

	public void setCat_id_categoria(Integer cat_id_categoria) {
		this.cat_id_categoria = cat_id_categoria;
	}

	public String getNombre_inmueble() {
		return nombre_inmueble;
	}

	public void setNombre_inmueble(String nombre_inmueble) {
		this.nombre_inmueble = nombre_inmueble;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUrl_imagen() {
		return url_imagen;
	}

	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
