package com.jugadores.votacion_mundial.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voto")
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_voto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jugador")
	private Jugador jugador;

	public Jugador getJugador() {
		return jugador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
