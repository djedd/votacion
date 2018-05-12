package models;

import java.sql.Date;

public class Usuario {

	private Integer id_usuario;
	private String nombre;
	private String apellido;
	private Integer identificacion;
	private String contrasena;
	private String tipo;
	private Date fechaRegistro;

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

}
