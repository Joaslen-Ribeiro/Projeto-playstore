package com.joaslen.projeto.resources;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joaslen.projeto.domain.Categoria;
import com.joaslen.projeto.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ) { // @pathvariable para saber que o id vai na url
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	

}