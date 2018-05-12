package com.jugadores.votacion_mundial.controllers;

import java.util.ArrayList;
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
import com.jugadores.votacion_mundial.models.Usuario;
import com.jugadores.votacion_mundial.models.Voto;
import com.jugadores.votacion_mundial.repositories.VotoRepository;

@RestController
@JsonIgnoreProperties({ "hibernatenLazyInitializer", "handler" })
@RequestMapping("/api/v1/voto")
public class VotoController {

	@Autowired
	private VotoRepository votoRepository;

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void createVoto(@RequestBody Voto voto) {
		votoRepository.save(voto);
	}

	@GetMapping("/findall")
	public List<Voto> getUsuarioList() {
		return votoRepository.findAll();
	}

	@GetMapping("/finduser/{usuario}")
	public List<Voto> getUsuarioVoto(@PathVariable("usuario") Usuario usuario) {
		
		List<Integer> id = new ArrayList<Integer>();
		id.add(usuario.getId_usuario());
		return votoRepository.findAllById(id);
	}

	//

	@GetMapping("/delete/{voto}")
	public void deleteUsuario(@PathVariable("voto") Voto voto) {
		// if(!usuarioRepository.getOne(id).equals(null))
		// usuarioRepository.delete(usuarioRepository.getOne(id));
		//if (votoRepository.existsById(voto.getJugador().getId_jugador()) && votoRepository.existsById(voto.getUsuario().getId_usuario()))
				//votoRepository.delete(votoRepository.getOne());

	}
}
