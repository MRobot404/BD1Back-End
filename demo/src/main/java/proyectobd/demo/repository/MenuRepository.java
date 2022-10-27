package proyectobd.demo.repository;

import java.awt.Menu;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("menuRepository")
public interface MenuRepository extends JpaRepository<Menu, Serializable> {

}
