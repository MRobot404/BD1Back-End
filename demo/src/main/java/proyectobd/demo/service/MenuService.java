package proyectobd.demo.service;

import java.awt.Menu;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import proyectobd.demo.repository.MenuRepository;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuService {
	
	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping(path = "/buscar")
     public List<Menu> buscar(){
		return menuRepository.findAll();
	}

}
