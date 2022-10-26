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
@Table(name = "telefono")
public class Telefono implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	 @GenericGenerator(name = "IDTELEFONO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	 @Parameter(name = "sequence_name", value = "IDTELEFONO"),
	 @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1"),
	 @Parameter(name = "schema", value = "SYSTEM") })

	
	@Id
    @Basic(optional = false)
    @Column(name = "IDTELEFONO")
    @GeneratedValue(generator = "IDTELEFONO")
    private Integer idtelefono;
   
   
   @Column(name = "IDCLIENTE")
	 private  String idcliente;

   @Column(name = "IDPERSONA")
	 private  String idpersona;
   
   @Column(name = "NUMERO")
	 private  String numero;

public Integer getIdtelefono() {
	return idtelefono;
}

public void setIdtelefono(Integer idtelefono) {
	this.idtelefono = idtelefono;
}

public String getIdcliente() {
	return idcliente;
}

public void setIdcliente(String idcliente) {
	this.idcliente = idcliente;
}

public String getIdpersona() {
	return idpersona;
}

public void setIdpersona(String idpersona) {
	this.idpersona = idpersona;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   
   
   


}
