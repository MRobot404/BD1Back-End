package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
