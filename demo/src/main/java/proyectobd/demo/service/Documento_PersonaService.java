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

import proyectobd.demo.entity.Departamento;
import proyectobd.demo.entity.Documento_Persona;

import proyectobd.demo.repository.Documento_PersonaRepository;

@RestController
@RequestMapping("/documento_persona")
@CrossOrigin
public class Documento_PersonaService {

	@Autowired
	Documento_PersonaRepository documento_personaRepository;

	@GetMapping(path = "/buscar")
	public List<Documento_Persona> buscar() {
		return documento_personaRepository.findAll();
	}
	
	@PostMapping(path ="/guardar")
	public Documento_Persona savedocumento_persona(@RequestBody Documento_Persona documento_Persona) {
		return documento_personaRepository.save(documento_Persona);
	}
	
	@DeleteMapping(path="/eliminar/{id_documento_persona}")
	public void eliminar(@PathVariable ("id_documento_persona") Integer id_documento_persona) {
		Optional <Documento_Persona> documento = documento_personaRepository.findById(id_documento_persona);
		if(documento.isPresent()) {
			documento_personaRepository.delete(documento.get());
		}
	}
}
