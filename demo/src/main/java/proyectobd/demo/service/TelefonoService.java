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
	
	@PostMapping(path = "/guardar")
	public Telefono saveTelefono(@RequestBody Telefono telefono) {
		return telefonoRepository.save(telefono);
	}
	
	@DeleteMapping(path = "/eliminar/{idtelefono}")
	public void eliminar(@PathVariable("idtelefono") Integer idtelefono) {
		Optional<Telefono> telefono = telefonoRepository.findById(idtelefono);
		if (telefono.isPresent()) {
			telefonoRepository.delete(telefono.get());
		}
	}
	
}
