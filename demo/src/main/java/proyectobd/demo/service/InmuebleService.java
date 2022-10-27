package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
