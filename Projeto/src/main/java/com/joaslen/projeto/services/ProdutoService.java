package com.joaslen.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.joaslen.projeto.domain.Categoria;
import com.joaslen.projeto.domain.Pedido;
import com.joaslen.projeto.domain.Produto;
import com.joaslen.projeto.repositories.CategoriaRepository;
import com.joaslen.projeto.repositories.PedidoRepository;
import com.joaslen.projeto.repositories.ProdutoRepository;
import com.joaslen.projeto.services.services.exception.ObjectNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	

	public Produto find(Integer id) {
		Optional<Produto> obj = repository.findById(id);

		
		return obj.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id + ", Tipo: "+ Pedido.class.getName()));
}

	public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		List<Categoria> categorias = categoriaRepository.findAllById(ids);
		return repository.search(nome, categorias, pageRequest);
	}
	
}
