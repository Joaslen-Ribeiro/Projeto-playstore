package com.joaslen.projeto.domain;

import javax.persistence.Entity;

import com.joaslen.projeto.domain.enums.EstadoPagamento;


@Entity
public class PagamentoCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;
	
	
	public PagamentoCartao() {}


	public PagamentoCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estadoPagamento, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}


	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}


	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
