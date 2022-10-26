package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import proyectobd.demo.entity.Telefono;
import proyectobd.demo.repository.TelefonoRepository;


@RestController
@RequestMapping("/telefono")
@CrossOrigin
public class TelefonoService {

	@Autowired
	TelefonoRepository telefonoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Telefono> buscar(){
		return telefonoRepository.findAll();
	}
}
