package com.joaslen.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaslen.projeto.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
