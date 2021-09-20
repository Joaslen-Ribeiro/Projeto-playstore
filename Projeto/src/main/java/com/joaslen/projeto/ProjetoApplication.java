package com.joaslen.projeto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joaslen.projeto.domain.Categoria;
import com.joaslen.projeto.domain.Cidade;
import com.joaslen.projeto.domain.Cliente;
import com.joaslen.projeto.domain.Endereco;
import com.joaslen.projeto.domain.Estado;
import com.joaslen.projeto.domain.Produto;
import com.joaslen.projeto.domain.enums.TipoCliente;
import com.joaslen.projeto.repositories.CategoriaRepository;
import com.joaslen.projeto.repositories.ClienteRepository;
import com.joaslen.projeto.repositories.EnderecoRepository;
import com.joaslen.projeto.repositories.EstadoRepository;
import com.joaslen.projeto.repositories.ProdutoRepository;
import com.joaslen.projeto.repositories.cidadeRepository;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner  { // permitir implementar um metodo
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private cidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	
	Categoria cat1 = new Categoria(null, " informatica ");
	Categoria cat2 = new Categoria(null, " Escritorio " );
	
	Produto p1 = new Produto(null, "Compputador", 2.000 );
	Produto p2 = new Produto(null, "Impressora", 800.00);
	Produto p3 = new Produto(null, "Mouse", 80.00);
	
	cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
	cat2.getProdutos().addAll(Arrays.asList(p2));
	
	p1.getCategorias().addAll(Arrays.asList(cat1));
	p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
	p3.getCategorias().addAll(Arrays.asList(cat1));
	
	categoriaRepository.saveAll(Arrays.asList(cat1 , cat2));
	produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	
	
	Estado est1 = new Estado(null, "Minas Gerais" );
	Estado est2 = new Estado(null, "São Paulo" );
	
	Cidade c1 = new Cidade(null, "Uberlândia", est1);
	Cidade c2 = new Cidade(null, "São Paulo", est2);
	Cidade c3 = new Cidade(null, "Campinas", est2);
	
	est1.getCidades().addAll(Arrays.asList(c1));
	est1.getCidades().addAll(Arrays.asList(c2 , c3));
	
	estadoRepository.saveAll(Arrays.asList(est1,est2));
	cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));

	Cliente cli1 = new Cliente(null, "MAria Silva", "maria@gmail.com ","36378912377", TipoCliente.PESSOAFISICA);

	cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
	
	Endereco e1 = new Endereco(null,"rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
	Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
	cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
	
	clienteRepository.saveAll(Arrays.asList(cli1));
	enderecoRepository.saveAll(Arrays.asList(e1,e2));

}
}
