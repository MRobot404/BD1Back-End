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

import proyectobd.demo.entity.Reserva_Pago;
import proyectobd.demo.repository.Reserva_PagoRepository;

@RestController
@RequestMapping("/reserva_pago")
@CrossOrigin
public class Reserva_PagoService {

	@Autowired
	Reserva_PagoRepository reservaPagoRepository;
	
	@GetMapping(path = "/buscar")
    public List<Reserva_Pago> buscar(){
		return reservaPagoRepository.findAll();
		
	}
    
    @PostMapping(path = "/guardar")
	public Reserva_Pago savereserva_pago(@RequestBody Reserva_Pago reservapago) {
		return reservaPagoRepository.save(reservapago);
	}
	
    
	@DeleteMapping(path = "/eliminar/{id_reserva_pago}")
	public void eliminar(@PathVariable("id_reserva_pago") Integer id_reserva_pago) {
		Optional<Reserva_Pago> reservapago = reservaPagoRepository.findById(id_reserva_pago);
		if (reservapago.isPresent()) {
			reservaPagoRepository.delete(reservapago.get());
		}
	}
}
