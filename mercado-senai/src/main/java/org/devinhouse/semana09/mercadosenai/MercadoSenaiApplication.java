package org.devinhouse.semana09.mercadosenai;

import org.devinhouse.semana09.mercadosenai.models.Categoria;
import org.devinhouse.semana09.mercadosenai.models.Cliente;
import org.devinhouse.semana09.mercadosenai.models.Produto;
import org.devinhouse.semana09.mercadosenai.services.CategoriaService;
import org.devinhouse.semana09.mercadosenai.services.ClienteService;
import org.devinhouse.semana09.mercadosenai.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MercadoSenaiApplication implements CommandLineRunner {

	@Autowired
	private ProdutoService produtoService;
	@Autowired private CategoriaService categoriaService;
	@Autowired private ClienteService clienteService;
	public static void main(String[] args) {
		SpringApplication.run(MercadoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria();
		categoria1.setNome("Cursos");

		Categoria categoria2 = new Categoria();
		categoria2.setNome("Bootcamps");

		Produto produto1 = new Produto();
		produto1.setNome("Curso Java");
		produto1.setDescricao("Curso didático de Java");
		produto1.setPreco(50);
		produto1.setCategoria(categoria1);

		Produto produto2 = new Produto();
		produto2.setNome("Curso Spring");
		produto2.setDescricao("Curso didático de Spring");
		produto2.setPreco(60);
		produto2.setCategoria(categoria1);

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Larissa");
		cliente1.setCpf("000.000.000-85");
		cliente1.setDataNascimento("01/01/2000");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria");
		cliente2.setCpf("111.000.000-85");
		cliente2.setDataNascimento("01/04/2000");

		List<Produto> produtosCliente1 = new ArrayList<>();
		produtosCliente1.add(produto1);
		produtosCliente1.add(produto2);
		cliente1.setProdutos(produtosCliente1);

		categoriaService.salvar(categoria1);
		categoriaService.salvar(categoria2);

		produtoService.salvar(produto1);
		produtoService.salvar(produto2);

		clienteService.salvar(cliente1);
		clienteService.salvar(cliente2);



	}

}
