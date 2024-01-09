package br.com.jvcardoso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jvcardoso.curso.entities.Produto;

@Repository //não obrigatorio devido a ja extender da classse JPA
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
