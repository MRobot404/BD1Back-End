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
@Table(name = "reserva_pago")
public class Reserva_Pago implements Serializable {

    private static final long serialVersionUID = 20L;

    @GenericGenerator(name = "ID_RESERVA_PAGO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
            @Parameter(name = "sequence_name", value = "test_seq15"), @Parameter(name = "initial_value", value = "1"),
            @Parameter(name = "increment_size", value = "1"), @Parameter(name = "schema", value = "SYSTEM") })

    @Id
    @Basic(optional = false)
    @Column(name = "ID_RESERVA_PAGO")
    @GeneratedValue(generator = "ID_RESERVA_PAGO")
    private Integer id_reserva_pago;

    @Column(name = "IDRESERVA")
    private Integer IDRESERVA;

    public Integer getId_reserva_pago() {
        return id_reserva_pago;
    }

    public void setId_reserva_pago(Integer id_reserva_pago) {
        this.id_reserva_pago = id_reserva_pago;
    }

    public Integer getIDRESERVA() {
        return IDRESERVA;
    }

    public void setIDRESERVA(Integer iDRESERVA) {
        IDRESERVA = iDRESERVA;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}