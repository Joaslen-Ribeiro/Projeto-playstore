package com.joaslen.projeto.domain.enums;



public enum TipoCliente {
	
	PESSOAFISICA(1,"Pessoa Física"),
	PESSOAJURIDICA(2,"Pessoa Jurídica");

	private int cod;
	
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {                // construtor de tipo enumerado é private
		this.cod= cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) { // todos os valores possiveis
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new  IllegalArgumentException("Id Invalido: "+ cod);
	
	}

}
