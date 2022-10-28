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

import proyectobd.demo.entity.Correo;
import proyectobd.demo.repository.CorreoRepository;

@RestController
@RequestMapping("/correo")
@CrossOrigin
public class CorreoService {

	@Autowired
	CorreoRepository correoRepository;

	@GetMapping(path = "/buscar")
	public List<Correo> buscar() {
		return correoRepository.findAll();
	}
	
	@PostMapping(path ="/guardar")
	public Correo savecorreo(@RequestBody Correo correo) {
		return correoRepository.save(correo);
	}
	
	@DeleteMapping(path="/eliminar/{idcorreo}")
	public void eliminar(@PathVariable ("idcorreo") Integer idcorreo) {
		Optional <Correo> correo =  correoRepository.findById(idcorreo);
		if(correo.isPresent()) {
			correoRepository.delete(correo.get());
		}
	}

}
