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

import proyectobd.demo.entity.Empleado;
import proyectobd.demo.entity.Estado;
import proyectobd.demo.repository.EstadoRepository;


@RestController
@RequestMapping("/estado")
@CrossOrigin
public class EstadoService {
	

	@Autowired
	EstadoRepository estadoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Estado> buscar(){
		return estadoRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Estado saveEstado(@RequestBody Estado estado) {
		return estadoRepository.save(estado);
	}
	
	@DeleteMapping(path = "/eliminar/{id_estado_inmueble}")
	public void eliminar(@PathVariable("id_estado_inmueble") Integer id_estado_inmueble) {
		Optional<Estado> estado = estadoRepository.findById(id_estado_inmueble);
		if (estado.isPresent()) {
			estadoRepository.delete(estado.get());
		}
	}

}
