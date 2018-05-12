package com.jugadores.votacion_mundial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jugadores.votacion_mundial.models.Jugador;
import com.jugadores.votacion_mundial.repositories.JugadorRepository;

@RestController
@JsonIgnoreProperties({"hibernatenLazyInitializer", "handler"})
@RequestMapping("/api/v1/jugador")
public class JugadorController {

	@Autowired
	private JugadorRepository jugadorRepository;

	
	@GetMapping("/findall")
	public List<Jugador> getJugadorList() {
		return jugadorRepository.findAll();
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void createJugador(@RequestBody Jugador jugador) {
		jugadorRepository.save(jugador);
	}
	
	@GetMapping("/find/{id}")
	public Jugador getJugador(@PathVariable("id") int id) {
		return jugadorRepository.getOne(id);
	}
	
	@GetMapping("/delete/{id}")
	public void deleteJugador(@PathVariable("id") int id) {
		//if(!jugadorRepository.getOne(id).equals(null))
			//jugadorRepository.delete(jugadorRepository.getOne(id));
		if(jugadorRepository.existsById(id))
			jugadorRepository.delete(jugadorRepository.getOne(id));

	}
	
	@GetMapping("/update/{jugador}")
	public void updateJugador(@PathVariable("id") Jugador jugador ) {
		if(jugadorRepository.existsById(jugador.getId_jugador())) {
			Jugador j = jugadorRepository.getOne(jugador.getId_jugador());
			
			j.setNombre(jugador.getNombre());
			j.setApellido(jugador.getApellido());
			j.setClub(jugador.getClub());
		}
			
	}

}
