package br.com.jvcardoso.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvcardoso.curso.entities.Produto;
import br.com.jvcardoso.curso.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> localizarTodos(){
		//Produto u = new Produto(1L, "Juliano V. Cardoso", "juliano@testes.com.br", "999999", "123456");
		
		List<Produto> lista = produtoService.localizarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> localizarPorId(@PathVariable Long id) {
		try {
			Produto obj = produtoService.localizarPorId(id);
			return ResponseEntity.ok().body(obj);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
		
	}

}
