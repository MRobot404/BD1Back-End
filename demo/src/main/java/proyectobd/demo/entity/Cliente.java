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
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @GenericGenerator(name = "IDCLIENTE", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
            @Parameter(name = "sequence_name", value = "test_seq2"), @Parameter(name = "initial_value", value = "1"),
            @Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

    @Id
    @Basic(optional = false)
    @Column(name = "IDCLIENTE")
    @GeneratedValue(generator = "IDCLIENTE")
    private Integer id_cliente;

    @Column(name = "IDPERSONA")
    private Integer id_persona;

    @Column(name = "ID_TIPO_USUARIO")
    private Integer id_tipo_usuario;

    @Column(name = "FECHA_ALTA")
    private String fecha_alta;

    @Column(name = "USUARIO_CLIENTE")
    private String usuario_cliente;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public Integer getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(Integer id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getUsuario_cliente() {
        return usuario_cliente;
    }

    public void setUsuario_cliente(String usuario_cliente) {
        this.usuario_cliente = usuario_cliente;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}