package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Municipio;
import proyectobd.demo.repository.MunicipioRepository;

@RestController
@RequestMapping("/municipio")
@CrossOrigin
public class MunicipioService {

	@Autowired
	MunicipioRepository municipioRepository;
	
	@GetMapping(path = "/buscar")
     public List<Municipio> buscar(){
		return municipioRepository.findAll();
	}
}
