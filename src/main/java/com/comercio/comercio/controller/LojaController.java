package com.comercio.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comercio.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 15 1");
		p1.setCodigoBarras("145632KHJGFF767678");
		p1.setDescrição("Produto LInha Branca com painel digital");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p2.setId(20l);
		p2.setNome("Batedeira Britânia BBT350P");
		p2.setCodigoBarras("99887VHVHVHHPP74");
		p2.setDescrição("Com 350W de potência e 4 velocidades, diferentes regulagens para melhor se adequar aos mais variados tipos de receitas.");
		p2.setPreco(250.00);
		
		return "produtos";
		}
}
