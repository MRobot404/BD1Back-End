package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Zona;

@Repository("zonaRepository")
public interface ZonaRepository extends JpaRepository<Zona, Serializable> {

}
