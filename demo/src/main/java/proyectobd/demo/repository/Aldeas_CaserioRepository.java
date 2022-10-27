package proyectobd.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Aldeas_Caserio;


@Repository("aldeas_caserioRepository")
public interface Aldeas_CaserioRepository extends JpaRepository<Aldeas_Caserio, Serializable>{

}
