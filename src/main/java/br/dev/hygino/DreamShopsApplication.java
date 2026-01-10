package br.dev.hygino;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DreamShopsApplication implements CommandLineRunner {
	private final Logger logger = Logger.getLogger(DreamShopsApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(DreamShopsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("DreamShopsApplication started successfully.");
	}

}
