package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Categorias;
import proyectobd.demo.entity.Cliente;
import proyectobd.demo.repository.CategoriasRepository;


@RestController
@RequestMapping("/categorias")
@CrossOrigin
public class CategoriasSerive {	
	
	@Autowired
	CategoriasRepository categoriasRepository;
	
	@GetMapping(path = "/buscar")
     public List<Categorias> buscar(){
		return categoriasRepository.findAll();
	}
	
	@PostMapping(path ="/guardar")
	public Categorias savecliente(@RequestBody Categorias categorias) {
		return categoriasRepository.save(categorias);
	}

}
