package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Renta_Pago;
import proyectobd.demo.repository.Renta_PagoRepository;

@RestController
@RequestMapping("/renta_pago")
@CrossOrigin
public class Renta_PagoService {
	
	@Autowired
	Renta_PagoRepository renta_pagoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Renta_Pago> buscar(){
		return renta_pagoRepository.findAll();
	}

}
