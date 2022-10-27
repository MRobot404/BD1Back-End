package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Correo;


@Repository("correoRepository")
public interface CorreoRepository extends JpaRepository<Correo, Serializable>{

}
