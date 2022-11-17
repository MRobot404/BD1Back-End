package proyectobd.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectobd.demo.entity.Cliente;


@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{
	public List<Cliente> findByUsuarioAndContrasena(String usuario, String contrasena);
}
