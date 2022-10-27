package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Rol_Tipo_Usuario;

@Repository("rol_tipo_usuarioRepository")
public interface Rol_Tipo_UsuarioRepository extends JpaRepository<Rol_Tipo_Usuario, Serializable> {

}
