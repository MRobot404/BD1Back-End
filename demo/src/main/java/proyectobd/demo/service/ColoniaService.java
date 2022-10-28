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

import proyectobd.demo.entity.Cliente;
import proyectobd.demo.entity.Colonia;

import proyectobd.demo.repository.ColoniaRepository;


@RestController
@RequestMapping("/colonia")
@CrossOrigin
public class ColoniaService {

	@Autowired
	ColoniaRepository coloniaRepository;
	
	@GetMapping(path = "/buscar")
     public List<Colonia> buscar(){
		return coloniaRepository.findAll();
	}
	
	@PostMapping(path ="/guardar")
	public Colonia savecolonia(@RequestBody Colonia colonia) {
		return coloniaRepository.save(colonia);
	}
	
	@DeleteMapping(path="/eliminar/{id_colonias}")
	public void eliminar(@PathVariable ("id_colonias") Integer id_colonias) {
		Optional <Colonia> colonia =  coloniaRepository.findById(id_colonias);
		if(colonia.isPresent()) {
			coloniaRepository.delete(colonia.get());
		}
	}
}
