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
     
     @PostMapping(path = "/guardar")
 	public Renta_Pago saverentapago(@RequestBody Renta_Pago renta_Pago) {
 		return renta_pagoRepository.save(renta_Pago);
 	}
     
 	@DeleteMapping(path = "/eliminar/{id_renta_pago}")
 	public void eliminar(@PathVariable("id_renta_pago") Integer id_renta_pago) {
 		Optional<Renta_Pago> renta_pago = renta_pagoRepository.findById(id_renta_pago);
 		if (renta_pago.isPresent()) {
 			renta_pagoRepository.delete(renta_pago.get());
 		}
 	}

}
