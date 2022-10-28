package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Empleado;
import proyectobd.demo.entity.Persona;
@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable> {

}
