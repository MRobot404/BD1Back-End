package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
