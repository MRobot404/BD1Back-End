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

import proyectobd.demo.entity.Estado;
import proyectobd.demo.entity.Inmueble;
import proyectobd.demo.repository.InmuebleRepository;


@RestController
@RequestMapping("/inmueble")
@CrossOrigin
public class InmuebleService {
	
	@Autowired
	InmuebleRepository inmuebleRepository;
	
	@GetMapping(path = "/buscar")
     public List<Inmueble> buscar(){
		return inmuebleRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Inmueble saveinmueble(@RequestBody Inmueble inmueble) {
		return inmuebleRepository.save(inmueble);
	}
	
	@DeleteMapping(path = "/eliminar/{id_inmueble}")
	public void eliminar(@PathVariable("id_inmueble") Integer id_estado_inmueble) {
		Optional<Inmueble> inmueble = inmuebleRepository.findById(id_estado_inmueble);
		if (inmueble.isPresent()) {
			inmuebleRepository.delete(inmueble.get());
		}
	}

}
