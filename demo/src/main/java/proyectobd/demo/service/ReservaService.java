package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Reserva;
import proyectobd.demo.repository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class ReservaService {

	@Autowired
	ReservaRepository reservaRepository;
	
	@GetMapping(path = "/buscar")
     public List<Reserva> buscar(){
		return reservaRepository.findAll();
	}
}
