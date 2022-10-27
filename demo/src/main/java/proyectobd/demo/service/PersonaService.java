package proyectobd.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping(path ="/guardar")
	public Persona saveRol(@RequestBody Persona persona) {
		return personaRepository.save(persona);
	}
	
	@DeleteMapping(path="/eliminar/{idpersona}")
	public void eliminar(@PathVariable ("idpersona") Integer idpersona) {
		Optional <Persona> persona =  personaRepository.findById(idpersona);
		if(persona.isPresent()) {
			personaRepository.delete(persona.get());
		}
	}
}
