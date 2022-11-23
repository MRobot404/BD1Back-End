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
import proyectobd.demo.entity.Correo;
import proyectobd.demo.entity.Empleado;
import proyectobd.demo.entity.Persona;
import proyectobd.demo.entity.Telefono;
import proyectobd.demo.repository.ClienteRepository;
import proyectobd.demo.repository.CorreoRepository;
import proyectobd.demo.repository.Documento_PersonaRepository;
import proyectobd.demo.repository.EmpleadoRepository;
import proyectobd.demo.repository.PersonaRepository;
import proyectobd.demo.repository.TelefonoRepository;

@RestController
@RequestMapping("/persona")
@CrossOrigin
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	TelefonoRepository telefonoRepository;
	
	@Autowired
	CorreoRepository correoRepository;
	
	@Autowired
	Documento_PersonaRepository documento_PersonaRepository;
	
	
	
	@GetMapping(path = "/buscar")
     public List<Persona> buscar(){
		return personaRepository.findAll();
	}
	
	@GetMapping(path = "/buscar/por/{idpersona}")
    public Persona buscarDI(@PathVariable Integer idpersona){
		Optional<Persona>temp=personaRepository.findById(idpersona);
		if(temp.isPresent()) {
			return temp.get();
		}
		return null;
	}
	@PostMapping(path ="/guardar")
	public Persona saveRol(@RequestBody Persona persona) {
		
		List<Telefono> telefonos=persona.getTelefonolist();
		persona.setTelefonolist(null);
		personaRepository.save(persona);
		for(Telefono tel: telefonos) {
			tel.setIdpersona(persona.getIdpersona());
		}
		
		telefonoRepository.saveAll(telefonos);
		persona.setTelefonolist(telefonos);
		
		
		List<Correo> correos=persona.getCorreolist();
		persona.setCorreolist(null);
		personaRepository.save(persona);
		for(Correo cor: correos) {
			cor.setId_persona(persona.getIdpersona());
		}
		
		correoRepository.saveAll(correos);
		persona.setCorreolist(correos);
		
		
		List<Empleado> empleados=persona.getEmpleadolist();
		persona.setEmpleadolist(null);
		personaRepository.save(persona);
		for(Empleado emp: empleados) {
			emp.setId_persona(persona.getIdpersona());
		}
		
		empleadoRepository.saveAll(empleados);
		persona.setEmpleadolist(empleados);
		
		List<Cliente> clientes=persona.getClientelist();
		persona.setClientelist(null);
		personaRepository.save(persona);
		for(Cliente cl: clientes) {
			cl.setId_persona(persona.getIdpersona());
		}
		
		clienteRepository.saveAll(clientes);
		persona.setClientelist(clientes);
		
		return personaRepository.save(persona);
	}
	
	@DeleteMapping(path="/eliminar/{idpersona}")
	public void eliminar(@PathVariable ("idpersona") Integer idpersona) {
		Optional <Persona> persona =  personaRepository.findById(idpersona);
		if(persona.isPresent()) {
			telefonoRepository.deleteAll(persona.get().getTelefonolist());
			correoRepository.deleteAll(persona.get().getCorreolist());
			empleadoRepository.deleteAll(persona.get().getEmpleadolist());
			clienteRepository.deleteAll(persona.get().getClientelist());
			personaRepository.delete(persona.get());
		}
	}
	

}
