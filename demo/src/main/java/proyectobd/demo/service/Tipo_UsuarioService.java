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


import proyectobd.demo.entity.Tipo_Usuario;
import proyectobd.demo.repository.Tipo_UsuarioRepository;

@RestController
@RequestMapping("/tipo_usuario")
@CrossOrigin
public class Tipo_UsuarioService {

	@Autowired
	Tipo_UsuarioRepository tipo_usuarioRepository;
	
	@GetMapping(path = "/buscar")
     public List<Tipo_Usuario> buscar(){
		return tipo_usuarioRepository.findAll();
	}
     
     @PostMapping(path ="/guardar")
 	public Tipo_Usuario saveEmpleado(@RequestBody Tipo_Usuario tipo_Usuario) {
 		return tipo_usuarioRepository.save(tipo_Usuario);
 	}
     
     @DeleteMapping(path="/eliminar/{id_tipo_usuario}")
 	public void eliminar(@PathVariable ("id_tipo_usuario") Integer id_tipo_usuario) {
 		Optional <Tipo_Usuario> tipo=  tipo_usuarioRepository.findById(id_tipo_usuario);
 		if(tipo.isPresent()) {
 			tipo_usuarioRepository.delete(tipo.get());
 		}
 	}
}
