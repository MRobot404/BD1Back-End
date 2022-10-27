package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
import proyectobd.demo.entity.Empleado;

@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable> {
=======

import proyectobd.demo.entity.Empleado;


@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable>{
	
	
>>>>>>> 76d364d353372036d643f9b09e6f242166cf2823

}
