package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import proyectobd.demo.entity.Zona;
import proyectobd.demo.repository.ZonaRepository;

@RestController
@RequestMapping("/zona")
@CrossOrigin
public class ZonaService {
	
	@Autowired
	ZonaRepository zonaRepository;
	
	@GetMapping(path = "/buscar")
     public List<Zona> buscar(){
		return zonaRepository.findAll();
	}

}
