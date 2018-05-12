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
import com.jugadores.votacion_mundial.models.Usuario;
import com.jugadores.votacion_mundial.repositories.UsuarioRepository;

@RestController
@JsonIgnoreProperties({ "hibernatenLazyInitializer", "handler" })
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/findall")
	public List<Usuario> getUsuarioList() {
		return usuarioRepository.findAll();
	}

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void createUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@GetMapping("/find/{id}")
	public Usuario getUsuario(@PathVariable("id") int id) {
		return usuarioRepository.getOne(id);
	}

	@GetMapping("/delete/{id}")
	public void deleteUsuario(@PathVariable("id") int id) {
		// if(!usuarioRepository.getOne(id).equals(null))
		// usuarioRepository.delete(usuarioRepository.getOne(id));
		if (usuarioRepository.existsById(id))
			usuarioRepository.delete(usuarioRepository.getOne(id));

	}

	@GetMapping("/update/{Usuario}")
	public void updateUsuario(@PathVariable("id") Usuario usuario) {
		if (usuarioRepository.existsById(usuario.getId_usuario())) {
			Usuario u = usuarioRepository.getOne(usuario.getId_usuario());

			u.setNombre(usuario.getNombre());
			u.setApellido(usuario.getApellido());
			u.setIdentificacion(usuario.getIdentificacion());
			u.setContrasena(usuario.getContrasena());
		}

	}

}
