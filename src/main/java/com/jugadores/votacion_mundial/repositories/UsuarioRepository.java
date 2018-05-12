package com.jugadores.votacion_mundial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jugadores.votacion_mundial.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
