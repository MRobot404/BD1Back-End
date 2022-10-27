package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Inmueble;


@Repository("inmuebleRepository")
public interface InmuebleRepository extends JpaRepository<Inmueble, Serializable> {

}
