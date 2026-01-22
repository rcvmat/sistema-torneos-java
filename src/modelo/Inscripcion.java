package modelo;

import enums.EstadoInscripcion;

public class Inscripcion {
	private Socio socio;
	private EstadoInscripcion estado;

	public Inscripcion(Socio socio) {
		this.socio = socio;
		this.estado = EstadoInscripcion.ACTIVA;
	}

	public Socio getSocio() {
		return socio;
	}

	public EstadoInscripcion getEstado() {
		return estado;
	}

	public void darDeBaja() {
		this.estado = EstadoInscripcion.BAJA;
	}

}
