package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import proyectobd.demo.entity.Rol_Tipo_Usuario;

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

}
