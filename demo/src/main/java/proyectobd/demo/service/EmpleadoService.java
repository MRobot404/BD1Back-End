package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Empleado;
import proyectobd.demo.repository.EmpleadoRepository;


@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoService {

	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Empleado> buscar(){
		return empleadoRepository.findAll();
	}
	
}