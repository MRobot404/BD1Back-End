package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
