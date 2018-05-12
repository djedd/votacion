package models;

public class Voto {

	private Integer id_usuario;
	private Integer id_jugador;

	public Integer getId_jugador() {
		return id_jugador;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_jugador(Integer id_jugador) {
		this.id_jugador = id_jugador;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

}
