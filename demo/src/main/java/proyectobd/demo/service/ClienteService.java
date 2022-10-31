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

import proyectobd.demo.entity.Cliente;
import proyectobd.demo.repository.ClienteRepository;
@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(path = "/buscar")
     public List<Cliente> buscar(){
		return clienteRepository.findAll();
	}
	
	@PostMapping(path ="/guardar")
	public Cliente savecliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping(path="/eliminar/{idcliente}")
	public void eliminar(@PathVariable ("idcliente") Integer idcliente) {
		Optional <Cliente> cliente =  clienteRepository.findById(idcliente);
		if(cliente.isPresent()) {
			clienteRepository.delete(cliente.get());
		}
	}
}
