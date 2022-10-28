package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import proyectobd.demo.entity.Colonia;
import proyectobd.demo.repository.ClienteRepository;
import proyectobd.demo.repository.ColoniaRepository;

public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(path = "/buscar")
     public List<Colonia> buscar(){
		return coloniaRepository.findAll();
	}
}
