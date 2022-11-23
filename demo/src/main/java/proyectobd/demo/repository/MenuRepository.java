package proyectobd.demo.repository;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectobd.demo.entity.Menu;

@Repository("menuRepository")
public interface MenuRepository extends JpaRepository<Menu, Serializable> {
 public List<Menu> findByOpcion (String opcionmenu);
}