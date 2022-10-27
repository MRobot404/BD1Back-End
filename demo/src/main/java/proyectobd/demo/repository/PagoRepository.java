package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Pago;


@Repository("pagoRepository")
public interface PagoRepository extends JpaRepository<Pago, Serializable> {

}
