package br.com.jvcardoso.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvcardoso.curso.entities.PedidoItem;
import br.com.jvcardoso.curso.services.PedidoItemService;

@RestController
@RequestMapping(value = "/pedidoItems")
public class PedidoItemResource {
	
	@Autowired
	private PedidoItemService pedidoItemService;
	
	@GetMapping
	public ResponseEntity<List<PedidoItem>> localizarTodos(){
		//PedidoItem u = new PedidoItem(1L, "Juliano V. Cardoso", "juliano@testes.com.br", "999999", "123456");
		
		List<PedidoItem> lista = pedidoItemService.localizarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PedidoItem> localizarPorId(@PathVariable Long id) {
		try {
			PedidoItem obj = pedidoItemService.localizarPorId(id);
			return ResponseEntity.ok().body(obj);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
		
	}

}
