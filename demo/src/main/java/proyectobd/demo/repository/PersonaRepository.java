package proyectobd.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Persona;



@Repository("personaRepository")
public interface PersonaRepository extends JpaRepository<Persona, Serializable>{
}
