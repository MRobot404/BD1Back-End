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

import proyectobd.demo.entity.Cliente;
import proyectobd.demo.entity.Rol_Tipo_Usuario;
import proyectobd.demo.entity.Tipo_Usuario;
import proyectobd.demo.repository.ClienteRepository;
import proyectobd.demo.repository.Tipo_UsuarioRepository;

@RestController
@RequestMapping("/tipo_usuario")
@CrossOrigin
public class Tipo_UsuarioService {

	@Autowired
	Tipo_UsuarioRepository tipo_usuarioRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(path = "/buscar")
     public List<Tipo_Usuario> buscar(){
		return tipo_usuarioRepository.findAll();
	}
     
     @PostMapping(path ="/guardar")
 	public Tipo_Usuario saveEmpleado(@RequestBody Tipo_Usuario tipo_Usuario) {

 		List<Cliente> clientes=tipo_Usuario.getClientelist();
 		tipo_Usuario.setClientelist(null);
 		tipo_usuarioRepository.save(tipo_Usuario);
 		for(Cliente cls: clientes) {
 			cls.setId_tipo_usuario(tipo_Usuario.getId_tipo_usuario());
 		}
 		
 		clienteRepository.saveAll(clientes);
 		tipo_Usuario.setClientelist(clientes);
 		return tipo_usuarioRepository.save(tipo_Usuario);
 	}
     
     @DeleteMapping(path="/eliminar/{id_tipo_usuario}")
 	public void eliminar(@PathVariable ("id_tipo_usuario") Integer id_tipo_usuario) {
 		Optional <Tipo_Usuario> tipo=  tipo_usuarioRepository.findById(id_tipo_usuario);
 		if(tipo.isPresent()) {
 			clienteRepository.deleteAll(tipo.get().getClientelist());
 			tipo_usuarioRepository.delete(tipo.get());
 		}
 	}
}
