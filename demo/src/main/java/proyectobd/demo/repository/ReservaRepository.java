package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Reserva;


@Repository("reservaRepository")
public interface ReservaRepository extends JpaRepository<Reserva, Serializable> {

}
