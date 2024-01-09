package br.com.jvcardoso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvcardoso.curso.entities.Produto;
import br.com.jvcardoso.curso.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> localizarTodos(){
		return produtoRepository.findAll();
	}
	
	public Produto localizarPorId(Long id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.get();
	}
	
}
