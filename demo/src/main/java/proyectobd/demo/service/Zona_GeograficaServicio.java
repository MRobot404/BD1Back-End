package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

}
