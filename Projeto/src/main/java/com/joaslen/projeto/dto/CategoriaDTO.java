package com.joaslen.projeto.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.joaslen.projeto.domain.Categoria;
// para definir os dados que eu quero trafegar entao quando eu dar get ne um não ira vim os que tiverem associado a ele
public class CategoriaDTO  implements Serializable {
	private static final long serialVersionUID = 1L;    

	private Integer id;
	
	@NotEmpty(message="preenchimento obrigatório")
	@Length(min = 5, max=80, message="O tamanho deve sem entre 5 e 80 caracteres")
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
