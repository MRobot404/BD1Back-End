package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Colonia;


@Repository("coloniaRepository")
public interface ColoniaRepository extends JpaRepository<Colonia, Serializable> {

}
