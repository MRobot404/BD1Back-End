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


import proyectobd.demo.entity.Rol_Tipo_Usuario;
import proyectobd.demo.entity.Tipo_Usuario;
import proyectobd.demo.repository.Rol_Tipo_UsuarioRepository;

@RestController
@RequestMapping("/rol_tipo_usuario")
@CrossOrigin
public class Rol_Tipo_UsuarioServicio {
	
	@Autowired
	Rol_Tipo_UsuarioRepository rol_tipo_usuarioRepository;
	
	@GetMapping(path = "/buscar")
     public List<Rol_Tipo_Usuario> buscar(){
		return rol_tipo_usuarioRepository.findAll();
	}
     
     @PostMapping(path ="/guardar")
  	public Rol_Tipo_Usuario saveRolTipoUsuario(@RequestBody Rol_Tipo_Usuario rol_Tipo_Usuario) {
  		return rol_tipo_usuarioRepository.save(rol_Tipo_Usuario);
  	}
      
      @DeleteMapping(path="/eliminar/{id_rol_tipo_usuario}")
  	public void eliminar(@PathVariable ("id_rol_tipo_usuario") Integer id_rol_tipo_usuario) {
  		Optional <Rol_Tipo_Usuario> tipo=  rol_tipo_usuarioRepository.findById(id_rol_tipo_usuario);
  		if(tipo.isPresent()) {
  			rol_tipo_usuarioRepository.delete(tipo.get());
  		}
  	}
     
}
