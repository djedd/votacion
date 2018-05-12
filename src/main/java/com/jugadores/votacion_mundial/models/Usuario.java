package com.jugadores.votacion_mundial.models;

import java.sql.Date;
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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "apellido", nullable = false)
	private String apellido;

	@Column(name = "identificacion", nullable = false)
	private Integer identificacion;

	@Column(name = "contrasena", nullable = false)
	private String contrasena;

	@Column(name = "tipo", nullable = false)
	private String tipo;

	@Column(name = "fechaRegistro", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy HH:mm:ss")
	private Date fechaRegistro;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Voto> votos = new ArrayList<>();

	public String getApellido() {
		return apellido;
	}

	public String getContrasena() {
		return contrasena;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public List<Voto> getVotos() {
		return votos;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}

}
