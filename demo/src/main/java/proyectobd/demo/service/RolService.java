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
	
	@PostMapping(path ="/guardar")
	public Rol saveRol(@RequestBody Rol rol) {
		return rolRepository.save(rol);
	}
	
	@DeleteMapping(path="/eliminar/{id_rol}")
	public void eliminar(@PathVariable ("id_rol") Integer id_rol) {
		Optional <Rol> rol =  rolRepository.findById(id_rol);
		if(rol.isPresent()) {
			rolRepository.delete(rol.get());
		}
	}
}
