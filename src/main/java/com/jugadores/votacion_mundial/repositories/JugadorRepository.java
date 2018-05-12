package com.jugadores.votacion_mundial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jugadores.votacion_mundial.models.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

	
	
}
