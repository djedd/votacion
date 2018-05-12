package com.jugadores.votacion_mundial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jugadores.votacion_mundial.models.Voto;

public interface VotoRepository extends JpaRepository<Voto, Integer> {

	List<Voto> findAllUserVoto(Integer usuario);
	List<Voto> findAllJugadorVoto(Integer jugador);
	
}
