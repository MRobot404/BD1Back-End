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

import proyectobd.demo.entity.Telefono;
import proyectobd.demo.entity.Zona_Geografica;
import proyectobd.demo.repository.Zona_GeograficaRepository;

@RestController
@RequestMapping("/zona_geografica")
@CrossOrigin
public class Zona_GeograficaServicio {
	
	@Autowired
	Zona_GeograficaRepository zona_geograficaRepository;
	
	@GetMapping(path = "/buscar")
     public List<Zona_Geografica> buscar(){
		return zona_geograficaRepository.findAll();
	}
     
     @PostMapping(path = "/guardar")
 	public Zona_Geografica saveZona(@RequestBody Zona_Geografica zona_Geografica) {
 		return zona_geograficaRepository.save(zona_Geografica);
 	}
     
     @DeleteMapping(path = "/eliminar/{id_zona_geografica}")
 	public void eliminar(@PathVariable("id_zona_geografica") Integer id_zona_geografica) {
 		Optional<Zona_Geografica> zonaG = zona_geograficaRepository.findById(id_zona_geografica);
 		if (zonaG.isPresent()) {
 			zona_geograficaRepository.delete(zonaG.get());
 		}
 	}

}
