package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Tipo_Documento;

@Repository("tipo_documentoRepository")
public interface Tipo_DocumentoRepository extends JpaRepository<Tipo_Documento, Serializable>{

}
