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
import proyectobd.demo.repository.MunicipioRepository;

@RestController
@RequestMapping("/municipio")
@CrossOrigin
public class MunicipioService {

	@Autowired
	MunicipioRepository municipioRepository;
	
	@GetMapping(path = "/buscar")
     public List<Municipio> buscar(){
		return municipioRepository.findAll();
	}
	@PostMapping(path = "/guardar")
	public Municipio saveinmueble(@RequestBody Municipio municipio) {
		return municipioRepository.save(municipio);
	}
	
	@DeleteMapping(path = "/eliminar/{id_municipio}")
	public void eliminar(@PathVariable("id_municipio") Integer id_municipio) {
		Optional<Municipio> municipio = municipioRepository.findById(id_municipio);
		if (municipio.isPresent()) {
			municipioRepository.delete(municipio.get());
		}
	}
	
}
