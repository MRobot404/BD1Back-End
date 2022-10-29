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

import proyectobd.demo.entity.Municipio;
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

	@PostMapping(path = "/guardar")
	public Zona savezona(@RequestBody Zona zona) {
		return zonaRepository.save(zona);
	}
	
	@DeleteMapping(path = "/eliminar/{id_zona}")
	public void eliminar(@PathVariable("id_zona") Integer id_zona) {
		Optional<Zona> zona = zonaRepository.findById(id_zona);
		if (zona.isPresent()) {
			zonaRepository.delete(zona.get());
		}
	}
}
