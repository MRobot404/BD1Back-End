package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Municipio;


@Repository("municipioRepository")
public interface MunicipioRepository extends JpaRepository<Municipio, Serializable> {

}
