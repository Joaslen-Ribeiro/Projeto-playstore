package com.joaslen.projeto.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1,"Pendente"),
	QUITADO(2,"Pago"),
	CANCELADO(3,"Cancelado");
	
	
private int cod;
	
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {                // construtor de tipo enumerado é private
		this.cod= cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		for (EstadoPagamento x : EstadoPagamento.values()) { // todos os valores possiveis
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new  IllegalArgumentException("Id Invalido: "+ cod);
	
	}

	
}
