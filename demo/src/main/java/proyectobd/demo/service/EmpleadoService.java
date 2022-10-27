package proyectobd.demo.service;

import java.util.List;
<<<<<<< HEAD
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

import proyectobd.demo.entity.Persona;
import proyectobd.demo.repository.EmpleadoRepository;

=======

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Empleado;
import proyectobd.demo.repository.EmpleadoRepository;


>>>>>>> 76d364d353372036d643f9b09e6f242166cf2823
@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoService {

<<<<<<< HEAD
=======
	
>>>>>>> 76d364d353372036d643f9b09e6f242166cf2823
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@GetMapping(path = "/buscar")
<<<<<<< HEAD
    public List<Empleado> buscar(){
		return empleadoRepository.findAll();
	}
	@PostMapping(path ="/guardar")
	public Persona saveEmpleado(@RequestBody Empleado empleado) {
		return empleadoRepository.save(empleado);
	}
	
	@DeleteMapping(path="/eliminar/{idpersona}")
	public void eliminar(@PathVariable ("idpersona") Integer idpersona) {
		Optional <Persona> persona =  personaRepository.findById(idpersona);
		if(persona.isPresent()) {
			personaRepository.delete(persona.get());
		}
	}
=======
     public List<Empleado> buscar(){
		return empleadoRepository.findAll();
	}
>>>>>>> 76d364d353372036d643f9b09e6f242166cf2823
	
}
