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
import proyectobd.demo.entity.Persona;
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

	@DeleteMapping(path = "/eliminar/{id_menu}")
	public void eliminar(@PathVariable("id_menu") Integer id_menu) {
		Optional<Menu> menu = menuRepository.findById(id_menu);
		if (menu.isPresent()) {
			menuRepository.delete(menu.get());
		}
	}
	
	@GetMapping(path = "/buscar/por/{id_menu}")
    public Menu buscarDI(@PathVariable Integer id_menu){
		Optional<Menu>temp=menuRepository.findById(id_menu);
		if(temp.isPresent()) {
			return temp.get();
		}
		return null;
	}

}