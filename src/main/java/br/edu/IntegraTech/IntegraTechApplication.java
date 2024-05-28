package br.edu.IntegraTech;

import br.edu.IntegraTech.principal.Principal;
import br.edu.IntegraTech.reporisotory.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegraTechApplication implements CommandLineRunner {
	@Autowired
	private ItemRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(IntegraTechApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();


	}
}
