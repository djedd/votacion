package com.jugadores.votacion_mundial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {"com.jugadores.votacion_mundial"})
//@EnableJpaRepositories(basePackages = { "com.jugadores.votacion_mundial.repositories", "com.jugadores.votacion_mundial.models"})
public class VotacionMundialApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotacionMundialApplication.class, args);
		
		
	}
}
