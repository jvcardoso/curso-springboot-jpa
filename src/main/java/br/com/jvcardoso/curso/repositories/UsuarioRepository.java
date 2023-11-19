package br.com.jvcardoso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jvcardoso.curso.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
