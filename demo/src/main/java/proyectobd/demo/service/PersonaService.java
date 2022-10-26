package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Persona;
import proyectobd.demo.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
@CrossOrigin
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	@GetMapping(path = "/buscar")
     public List<Persona> buscar(){
		return personaRepository.findAll();
	}
}
