package proyectobd.demo.service;

import java.util.List;
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
	@PostMapping(path ="/guardar")
	public Empleado saveEmpleado(@RequestBody Empleado empleado) {
		return empleadoRepository.save(empleado);
	}
	
	@DeleteMapping(path="/eliminar/{id_empleado}")
	public void eliminar(@PathVariable ("id_empleado") Integer id_empleado) {
		Optional <Empleado> persona =  empleadoRepository.findById(id_empleado);
		if(persona.isPresent()) {
			empleadoRepository.delete(persona.get());
		}
	}
	


}

