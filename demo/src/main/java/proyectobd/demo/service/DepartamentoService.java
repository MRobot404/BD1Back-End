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

import proyectobd.demo.entity.Colonia;
import proyectobd.demo.entity.Correo;
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
	
	@PostMapping(path ="/guardar")
	public Departamento savedepartamento(@RequestBody Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	
	@DeleteMapping(path="/eliminar/{id_departamento}")
	public void eliminar(@PathVariable ("id_departamento") Integer id_departamento) {
		Optional <Departamento> departamento = departamentoRepository.findById(id_departamento);
		if(departamento.isPresent()) {
			departamentoRepository.delete(departamento.get());
		}
	}

}
