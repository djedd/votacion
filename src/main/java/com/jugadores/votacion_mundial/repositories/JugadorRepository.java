package com.jugadores.votacion_mundial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jugadores.votacion_mundial.models.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

	
	
}
