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

import proyectobd.demo.entity.Menu;
import proyectobd.demo.repository.MenuRepository;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuService {

	@Autowired
	MenuRepository menuRepository;

	@GetMapping(path = "/buscar")
	public List<Menu> buscar() {
		return menuRepository.findAll();
	}

	@PostMapping(path = "/guardar")
	public Menu saveMenu(@RequestBody Menu menu) {
		
		return menuRepository.save(menu);
	}

	@DeleteMapping(path = "/eliminar/{idmenu}")
	public void eliminar(@PathVariable("idmenu") Integer idmenu) {
		Optional<Menu> menu = menuRepository.findById(idmenu);
		if (menu.isPresent()) {
			menuRepository.delete(menu.get());
		}
	}
	
	@GetMapping(path = "/buscar/por/{idmenu}")
    public Menu buscarDI(@PathVariable Integer idmenu){
		Optional<Menu>temp=menuRepository.findById(idmenu);
		if(temp.isPresent()) {
			return temp.get();
		}
		return null;
	}
		
	@GetMapping(path = "/buscar/porr/{opcion}")
    public List <Menu> buscaropcion(@PathVariable String opcion){
		return menuRepository.findByOpcion(opcion);
	}

}