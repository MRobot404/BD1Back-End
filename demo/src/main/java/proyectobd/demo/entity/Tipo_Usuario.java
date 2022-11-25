package proyectobd.demo.entity;

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
@Table(name = "tipo_usuario")
public class Tipo_Usuario {
	
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "ID_TIPO_USUARIO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
		    @Parameter(name = "sequence_name", value = "test_seq21"),
		    @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
		    @Parameter(name = "schema", value = "SYSTEM") })



		   	@Id
		    @Basic(optional = false)
		    @Column(name = "ID_TIPO_USUARIO")
		    @GeneratedValue(generator = "ID_TIPO_USUARIO")
		    private Integer id_tipo_usuario;
	
	@Column(name = "TIPO_USUARIO")
	 private  String tipo_usuario;
	
	   @OneToMany(mappedBy = "id_tipo_usuario")
			private List<Cliente> clientelist;
	   
	   

	public List<Cliente> getClientelist() {
		return clientelist;
	}

	public void setClientelist(List<Cliente> clientelist) {
		this.clientelist = clientelist;
	}

	public Integer getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(Integer id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
