package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Estado;

@Repository("estadoRepository")
public interface EstadoRepository extends JpaRepository<Estado, Serializable> {

}
