package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Categorias;
import proyectobd.demo.repository.CategoriasRepository;


@RestController
@RequestMapping("/categorias")
@CrossOrigin
public class CategoriasSerive {	
	
	@Autowired
	CategoriasRepository cateogiasRepository;
	
	@GetMapping(path = "/buscar")
     public List<Categorias> buscar(){
		return cateogiasRepository.findAll();
	}

}
