package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Rol;



@Repository("rolRepository")
public interface RolRepository extends JpaRepository<Rol, Serializable> {

}
