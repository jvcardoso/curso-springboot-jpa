package br.com.jvcardoso.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.jvcardoso.curso.entities.Categoria;
import br.com.jvcardoso.curso.entities.Pedido;
import br.com.jvcardoso.curso.entities.Usuario;
import br.com.jvcardoso.curso.entities.enums.PedidoStatus;
import br.com.jvcardoso.curso.repositories.CategoriaRepository;
import br.com.jvcardoso.curso.repositories.PedidoRepository;
import br.com.jvcardoso.curso.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Electronics");
		Categoria cat2 = new Categoria(null, "Books");
		Categoria cat3 = new Categoria(null, "Computers");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
		Usuario u1 = new Usuario(null, "Juliano Ventura", "j@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Giulia Nunes", "g@gmail.com", "977777777", "123456");
		
		
		
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"),PedidoStatus.PAGO, u1);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"),PedidoStatus.AGUARDANDO_PAGAMENTO, u2);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"),PedidoStatus.ENVIADO, u1);
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
		pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}
