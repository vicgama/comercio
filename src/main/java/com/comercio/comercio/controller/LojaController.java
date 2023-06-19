package com.comercio.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comercio.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> ListaDeProdutos = new ArrayList<Produto>();
	
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
		
		Produto p3 = new Produto();
		p3.setId(20l);
		p3.setNome("Televisor 70'");
		p3.setCodigoBarras("1245GFGVPCOUFTDH");
		p3.setDescrição("Televisor com tela plana let Samsung");
		p3.setPreco(6235.70);
		
		// Adicionando os produtos à lista
		
		ListaDeProdutos.add(p1);
		
		return "produtos";
		}
}
