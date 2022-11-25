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


import proyectobd.demo.entity.Reserva;
import proyectobd.demo.entity.Reserva_Pago;
import proyectobd.demo.repository.ReservaRepository;
import proyectobd.demo.repository.Reserva_PagoRepository;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class ReservaService {

	@Autowired
	ReservaRepository reservaRepository;
	
	@Autowired
	Reserva_PagoRepository reserva_PagoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Reserva> buscar(){
		return reservaRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Reserva savereserva(@RequestBody Reserva reserva) {
		List<Reserva_Pago> reservas=reserva.getReserva_pagoslist();
		reserva.setReserva_pagoslist(null);
		reservaRepository.save(reserva);
		for(Reserva_Pago  resp: reservas) {
			resp.setIDRESERVA(reserva.getId_reserva());
		}
		
		reserva_PagoRepository.saveAll(reservas);
		reserva.setReserva_pagoslist(reservas);
		return reservaRepository.save(reserva);
	}
	
	@DeleteMapping(path = "/eliminar/{id_reserva}")
	public void eliminar(@PathVariable("id_reserva") Integer id_reserva) {
		Optional<Reserva> reserva = reservaRepository.findById(id_reserva);
		if (reserva.isPresent()) {
			reserva_PagoRepository.deleteAll(reserva.get().getReserva_pagoslist());
			reservaRepository.delete(reserva.get());
		}
	}
}
