package proyectobd.demo.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Menu;

@Repository("menuRepository")
public interface MenuRepository extends JpaRepository<Menu, Serializable> {

}