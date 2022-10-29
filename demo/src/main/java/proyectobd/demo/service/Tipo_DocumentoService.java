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

import proyectobd.demo.entity.Telefono;
import proyectobd.demo.entity.Tipo_Documento;
import proyectobd.demo.repository.Tipo_DocumentoRepository;

@RestController
@RequestMapping("/tipo_documento")
@CrossOrigin
public class Tipo_DocumentoService {

	@Autowired
	Tipo_DocumentoRepository tipo_documentoRepository;
	
	@GetMapping(path = "/buscar")
     public List<Tipo_Documento> buscar(){
		return tipo_documentoRepository.findAll();
	}
     
 	@PostMapping(path = "/guardar")
 	public Tipo_Documento saveTipo_Documento(@RequestBody Tipo_Documento tipo_Documento) {
 		return tipo_documentoRepository.save(tipo_Documento);
 	}
 	
 	@DeleteMapping(path = "/eliminar/{idtipopersona}")
 	public void eliminar(@PathVariable("idtipersona") Integer idpersona) {
 		Optional<Tipo_Documento> tipo_documento = tipo_documentoRepository.findById(idpersona);
 		if (tipo_documento.isPresent()) {
 			tipo_documentoRepository.delete(tipo_documento.get());
 		}
 	}
}
