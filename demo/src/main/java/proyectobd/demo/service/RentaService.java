package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Renta;
import proyectobd.demo.repository.RentaRepository;

@RestController
@RequestMapping("/renta")
@CrossOrigin
public class RentaService {
	
	@Autowired
	RentaRepository rentaRepository;
	
	@GetMapping(path = "/buscar")
     public List<Renta> buscar(){
		return rentaRepository.findAll();
	}

}
