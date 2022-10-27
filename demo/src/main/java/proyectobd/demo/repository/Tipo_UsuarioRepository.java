package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Tipo_Usuario;


@Repository("tipo_usuarioRepository")
public interface Tipo_UsuarioRepository extends JpaRepository<Tipo_Usuario, Serializable>{

}
