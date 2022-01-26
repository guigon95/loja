package com.guigon.loja.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemDaCompra> item;

	private EnderecoDTO endereco;

	public List<ItemDaCompra> getItem() {
		return item;
	}

	public void setItem(List<ItemDaCompra> item) {
		this.item = item;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}
