package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
