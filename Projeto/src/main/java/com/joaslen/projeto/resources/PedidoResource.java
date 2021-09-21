package com.joaslen.projeto.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.joaslen.projeto.domain.Pedido;
import com.joaslen.projeto.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id ) { // @pathvariable para saber que o id vai na url
		Pedido obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	

}
