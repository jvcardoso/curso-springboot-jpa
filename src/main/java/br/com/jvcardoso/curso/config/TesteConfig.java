package br.com.jvcardoso.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.jvcardoso.curso.entities.Pedido;
import br.com.jvcardoso.curso.entities.Usuario;
import br.com.jvcardoso.curso.repositories.PedidoRepository;
import br.com.jvcardoso.curso.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Juliano Ventura", "j@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Giulia Nunes", "g@gmail.com", "977777777", "123456");
		
		
		
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
		pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}
