package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Renta;


@Repository("rentaRepository")
public interface RentaRepository extends JpaRepository<Renta, Serializable>{

}
