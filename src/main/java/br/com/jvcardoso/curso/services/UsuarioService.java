package br.com.jvcardoso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvcardoso.curso.entities.Usuario;
import br.com.jvcardoso.curso.repositories.UsuarioRepository;
import br.com.jvcardoso.curso.services.exceptions.RecursoNaoEncontradoException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> localizarTodos(){
		return usuarioRepository.findAll();
	}
	
	public Usuario localizarPorId(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new RecursoNaoEncontradoException(id));
	}
	
	public Usuario inserir(Usuario obj) {
		return usuarioRepository.save(obj);
	}
	
	public void remover(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario atulizar(Long id, Usuario obj) {
		Usuario usr = usuarioRepository.getReferenceById(id);
		updateDados(usr, obj);
		return usuarioRepository.save(usr);
	}

	private void updateDados(Usuario usr, Usuario obj) {
		// TODO Auto-generated method stub
		usr.setNome(obj.getNome());
		usr.setTelefone(obj.getTelefone());
		usr.setEmail(obj.getEmail());
	}
	
}
