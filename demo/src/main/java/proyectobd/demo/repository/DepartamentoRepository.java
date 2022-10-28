package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Departamento;


@Repository("departamentoRepository")
public interface DepartamentoRepository extends JpaRepository<Departamento, Serializable> {

}
