package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Aldeas_Caserio;

@Repository("Aldeas_CaserioRepository")
public interface Aldeas_CaserioRepository extends JpaRepository<Aldeas_Caserio, Serializable>{

}
