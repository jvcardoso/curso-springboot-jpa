package br.com.jvcardoso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jvcardoso.curso.entities.Usuario;

@Repository //não obrigatorio devido a ja extender da classse JPA
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
