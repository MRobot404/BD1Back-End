package proyectobd.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import proyectobd.demo.entity.Empleado;
@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable> {
	public List<Empleado> findByUsuarioAndContrasena(String usuario, String contrasena);
}
