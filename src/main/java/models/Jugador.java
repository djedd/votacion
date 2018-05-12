package models;

public class Jugador {

	private Integer id_jugador;
	private String nombre;
	private String apellido;
	private String club;

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

}
