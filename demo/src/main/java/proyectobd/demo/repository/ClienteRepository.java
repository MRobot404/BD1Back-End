package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyectobd.demo.entity.Cliente;


@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

}
