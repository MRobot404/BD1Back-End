package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Documento_Persona;

@Repository("documento_personaRepository")
public interface Documento_PersonaRepository extends JpaRepository<Documento_Persona, Serializable> {

}
