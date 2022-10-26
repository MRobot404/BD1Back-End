package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Telefono;

@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono, Serializable> {

}
