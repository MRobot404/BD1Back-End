package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Correo;
import proyectobd.demo.repository.CorreoRepository;

@RestController
@RequestMapping("/correo")
@CrossOrigin
public class CorreoService {

	@Autowired
	CorreoRepository correoRepository;

	@GetMapping(path = "/buscar")
	public List<Correo> buscar() {
		return correoRepository.findAll();
	}

}
