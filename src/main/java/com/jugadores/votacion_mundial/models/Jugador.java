package com.jugadores.votacion_mundial.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "jugador")
public class Jugador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_jugador;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "apellido", nullable = false)
	private String apellido;

	@Column(name = "club", nullable = false)
	private String club;

	@OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
	private List<Voto> votos = new ArrayList<>();

	public String getApellido() {
		return apellido;
	}

	public String getClub() {
		return club;
	}

	public Integer getId_jugador() {
		return id_jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Voto> getVotos() {
		return votos;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void setId_jugador(Integer id_jugador) {
		this.id_jugador = id_jugador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}

}
