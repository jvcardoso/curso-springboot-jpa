package br.com.jvcardoso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvcardoso.curso.entities.PedidoItem;
import br.com.jvcardoso.curso.repositories.PedidoItemRepository;

@Service
public class PedidoItemService {
	
	@Autowired
	private PedidoItemRepository pedidoItemRepository;
	
	public List<PedidoItem> localizarTodos(){
		return pedidoItemRepository.findAll();
	}
	
	public PedidoItem localizarPorId(Long id) {
		Optional<PedidoItem> obj = pedidoItemRepository.findById(id);
		return obj.get();
	}
	
}
