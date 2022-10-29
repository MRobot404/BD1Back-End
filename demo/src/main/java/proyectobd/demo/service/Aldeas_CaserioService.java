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

import proyectobd.demo.entity.Aldeas_Caserio;
import proyectobd.demo.repository.Aldeas_CaserioRepository;


@RestController
@RequestMapping("/Aldeas_categorias")
@CrossOrigin
public class Aldeas_CaserioService {	
	
	@Autowired
	Aldeas_CaserioRepository aldeas_CaserioRepository;
	
	@GetMapping(path = "/buscar")
     public List<Aldeas_Caserio> buscar(){
		return aldeas_CaserioRepository.findAll();
	}
	
	@PostMapping(path ="/guardar")
	public Aldeas_Caserio saveCaserio(@RequestBody Aldeas_Caserio aldeas_Caserio) {
		return aldeas_CaserioRepository.save(aldeas_Caserio);
	}
	
	@DeleteMapping(path="/eliminar/{id_aldea}")
	public void eliminar(@PathVariable ("id_aldea") Integer id_aldea) {
		Optional <Aldeas_Caserio> aldeas =  aldeas_CaserioRepository.findById(id_aldea);
		if(aldeas.isPresent()) {
			aldeas_CaserioRepository.delete(aldeas.get());
		}
	}

}
