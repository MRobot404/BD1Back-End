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

import proyectobd.demo.entity.Renta;
import proyectobd.demo.entity.Renta_Pago;
import proyectobd.demo.repository.RentaRepository;
import proyectobd.demo.repository.Renta_PagoRepository;

@RestController
@RequestMapping("/renta")
@CrossOrigin
public class RentaService {
	
	@Autowired
	RentaRepository rentaRepository;
	
	@Autowired
	Renta_PagoRepository renta_PagoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Renta> buscar(){
		return rentaRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
 	public Renta saverentaservice(@RequestBody Renta renta) {

		List<Renta_Pago> rentas=renta.getRentapagolist();
		renta.setRentapagolist(null);
		rentaRepository.save(renta);
		for(Renta_Pago renta_pagos: rentas) {
			renta_pagos.setId_renta(renta.getId_renta());
		}
		
		renta_PagoRepository.saveAll(rentas);
		renta.setRentapagolist(rentas);
 		return rentaRepository.save(renta);
 	}
	
	@DeleteMapping(path = "/eliminar/{id_renta}")
 	public void eliminar(@PathVariable("id_renta") Integer id_renta) {
 		Optional<Renta> renta = rentaRepository.findById(id_renta);
 		if (renta.isPresent()) {
 			renta_PagoRepository.deleteAll(renta.get().getRentapagolist());
 			rentaRepository.delete(renta.get());
 		}
 	}

	

}
