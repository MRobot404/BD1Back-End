package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Reserva_Pago;

@Repository("reserva_pagoRepository")
public interface Reserva_PagoRepository extends JpaRepository<Reserva_Pago, Serializable> {

}
