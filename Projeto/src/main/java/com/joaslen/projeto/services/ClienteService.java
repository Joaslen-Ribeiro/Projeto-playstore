package com.joaslen.projeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaslen.projeto.domain.Cliente;
import com.joaslen.projeto.repositories.ClienteRepository;
import com.joaslen.projeto.services.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repository.findById(id);

		
		return obj.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id + ", Tipo: "+ Cliente.class.getName()));
}
	
	
	
}
