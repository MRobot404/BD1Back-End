package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Departamento;

import proyectobd.demo.repository.DepartamentoRepository;

@RestController
@RequestMapping("/departamento")
@CrossOrigin
public class DepartamentoService {

	@Autowired
	DepartamentoRepository departamentoRepository;

	@GetMapping(path = "/buscar")
	public List<Departamento> buscar() {
		return departamentoRepository.findAll();
	}

}
