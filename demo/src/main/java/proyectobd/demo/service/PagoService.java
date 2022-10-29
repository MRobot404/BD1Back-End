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
	
	@PostMapping(path = "/guardar")
	public Pago savepago(@RequestBody Pago pago) {
		return pagoRepository.save(pago);
	}
	
	@DeleteMapping(path = "/eliminar/{id_pago}")
	public void eliminar(@PathVariable("id_pago") Integer idpago) {
		Optional<Pago> pago = pagoRepository.findById(idpago);
		if (pago.isPresent()) {
			pagoRepository.delete(pago.get());
		}
	}
}
