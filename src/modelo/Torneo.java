package modelo;

import java.util.ArrayList;
import java.util.List;

import enums.EstadoTorneo;

public class Torneo {
	private String nombre;
	private EstadoTorneo estado;
	private List<Inscripcion> inscripciones;

	public Torneo(String nombre) {
		this.nombre = nombre;
		this.estado = EstadoTorneo.CREADO;
		this.inscripciones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public EstadoTorneo getEstado() {
		return estado;
	}

	public void iniciar() {
		this.estado = EstadoTorneo.EN_CURSO;
	}

	public void finalizar() {
		this.estado = EstadoTorneo.FINALIZADO;
	}

	public void agregarInscripcion(Inscripcion inscripcion) {
		inscripciones.add(inscripcion);
	}

	public List<Inscripcion> getInscripciones() {
		return inscripciones;
	}

}
