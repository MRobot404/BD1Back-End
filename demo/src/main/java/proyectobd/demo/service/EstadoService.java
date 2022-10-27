package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Estado;
import proyectobd.demo.repository.EstadoRepository;


@RestController
@RequestMapping("/estado")
@CrossOrigin
public class EstadoService {
	

	@Autowired
	EstadoRepository estadoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Estado> buscar(){
		return estadoRepository.findAll();
	}

}
