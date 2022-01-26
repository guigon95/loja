package com.guigon.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guigon.loja.dto.CompraDTO;
import com.guigon.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	public CompraService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompra(@RequestBody CompraDTO compra) {
		
		compraService.realizarCompra(compra);
		
	}
}
