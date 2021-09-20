package com.joaslen.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaslen.projeto.domain.Cidade;

public interface cidadeRepository extends JpaRepository<Cidade, Integer> {

}
