package proyectobd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectobd.demo.entity.Aldeas_Caserio;
import proyectobd.demo.repository.Aldeas_CaserioRepository;

@RestController
@RequestMapping("/aldeas_caserio")
@CrossOrigin
public class Aldeas_CaserioService {
	
	@Autowired
	Aldeas_CaserioRepository aldeas_caserioRepository;
	
	@GetMapping(path = "/buscar")
     public List<Aldeas_Caserio> buscar(){
		return aldeas_caserioRepository.findAll();
	}

}
