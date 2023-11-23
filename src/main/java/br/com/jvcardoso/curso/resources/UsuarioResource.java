package br.com.jvcardoso.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvcardoso.curso.entities.Usuario;
import br.com.jvcardoso.curso.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> localizarTodos(){
		//Usuario u = new Usuario(1L, "Juliano V. Cardoso", "juliano@testes.com.br", "999999", "123456");
		
		List<Usuario> lista = usuarioService.localizarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> localizarPorId(@PathVariable Long id) {
		try {
			Usuario obj = usuarioService.localizarPorId(id);
			return ResponseEntity.ok().body(obj);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
		
	}

}
