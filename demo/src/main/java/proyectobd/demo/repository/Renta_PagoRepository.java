package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Renta_Pago;


@Repository("renta_pagoRepository")
public interface Renta_PagoRepository  extends JpaRepository<Renta_Pago, Serializable>{

}
