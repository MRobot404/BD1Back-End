package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Pago;
import proyectobd.demo.repository.PagoRepository;


@RestController
@RequestMapping("/pago")
@CrossOrigin
public class PagoService {
	@Autowired
	PagoRepository pagoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Pago> buscar(){
		return pagoRepository.findAll();
	}
}
