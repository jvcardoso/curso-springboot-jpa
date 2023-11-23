package br.com.jvcardoso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvcardoso.curso.entities.Pedido;
import br.com.jvcardoso.curso.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> localizarTodos(){
		return pedidoRepository.findAll();
	}
	
	public Pedido localizarPorId(Long id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
		return obj.get();
	}
	
}
