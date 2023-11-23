package br.com.jvcardoso.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvcardoso.curso.entities.Pedido;
import br.com.jvcardoso.curso.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> localizarTodos(){
		//Pedido u = new Pedido(1L, "Juliano V. Cardoso", "juliano@testes.com.br", "999999", "123456");
		
		List<Pedido> lista = pedidoService.localizarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> localizarPorId(@PathVariable Long id) {
		try {
			Pedido obj = pedidoService.localizarPorId(id);
			return ResponseEntity.ok().body(obj);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
		
	}

}
