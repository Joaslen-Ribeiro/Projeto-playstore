package com.joaslen.projeto.dto;

import java.io.Serializable;

import com.joaslen.projeto.domain.Categoria;
// para definir os dados que eu quero trafegar entao quando eu dar get ne um não ira vim os que tiverem associado a ele
public class CategoriaDTO  implements Serializable {
	private static final long serialVersionUID = 1L;    

	private Integer id;
	private String nome;

	public CategoriaDTO(){}
	
	public CategoriaDTO(Categoria obj) {	
		id = obj.getId();
		nome = obj.getNome();
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
