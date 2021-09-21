package com.joaslen.projeto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.joaslen.projeto.domain.Cliente;

import com.joaslen.projeto.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
		
		@Autowired
		private ClienteService service;
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<Cliente> find(@PathVariable Integer id ) { // @pathvariable para saber que o id vai na url
			Cliente obj = service.find(id);
			
			return ResponseEntity.ok().body(obj);
			
		}
	
	
	
}
