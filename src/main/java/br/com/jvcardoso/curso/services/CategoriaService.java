package br.com.jvcardoso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvcardoso.curso.entities.Categoria;
import br.com.jvcardoso.curso.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> localizarTodos(){
		return categoriaRepository.findAll();
	}
	
	public Categoria localizarPorId(Long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.get();
	}
	
}
