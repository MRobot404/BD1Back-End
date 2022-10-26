package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Rol;
import proyectobd.demo.repository.RolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class RolService {

	@Autowired
	RolRepository rolRepository;
	
	@GetMapping(path = "/buscar")
     public List<Rol> buscar(){
		return rolRepository.findAll();
	}
}
