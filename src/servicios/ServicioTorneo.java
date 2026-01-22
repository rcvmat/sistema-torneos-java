package servicios;

import java.util.ArrayList;
import java.util.List;

import enums.EstadoInscripcion;
import informes.DatosInformeSocio;
import informes.SociosActivosPorTorneo;
import modelo.Inscripcion;
import modelo.Socio;
import modelo.Torneo;

public class ServicioTorneo {

	private List<Torneo> torneos;

	public ServicioTorneo() {
		this.torneos = new ArrayList<>();
	}

	public void agregarTorneo(Torneo torneo) {
		torneos.add(torneo);
	}

	public void inscribirSocio(String nombreTorneo, Socio socio) {
		Torneo torneo = buscarTorneo(nombreTorneo);
		if (torneo == null) {
			return;
		}

		if (socioYaInscripto(torneo, socio)) {
			return;
		}

		torneo.agregarInscripcion(new Inscripcion(socio));
	}

	public void darDeBajaSocio(String nombreTorneo, int numeroSocio) {
		Torneo torneo = buscarTorneo(nombreTorneo);
		if (torneo == null) {
			return;
		}

		for (Inscripcion inscripcion : torneo.getInscripciones()) {
			if (inscripcion.getSocio().getNumero() == numeroSocio
					&& inscripcion.getEstado() == EstadoInscripcion.ACTIVA) {
				inscripcion.darDeBaja();
				return;
			}
		}
	}

	private Torneo buscarTorneo(String nombre) {
		for (Torneo torneo : torneos) {
			if (torneo.getNombre().equals(nombre)) {
				return torneo;
			}
		}
		return null;
	}

	private boolean socioYaInscripto(Torneo torneo, Socio socio) {
		for (Inscripcion inscripcion : torneo.getInscripciones()) {
			if (inscripcion.getSocio().getNumero() == socio.getNumero()
					&& inscripcion.getEstado() == EstadoInscripcion.ACTIVA) {
				return true;
			}
		}
		return false;
	}

	public SociosActivosPorTorneo obtenerSociosActivos(String nombreTorneo) {
		Torneo torneo = buscarTorneo(nombreTorneo);
		if (torneo == null) {
			return null;
		}

		SociosActivosPorTorneo informe = new SociosActivosPorTorneo(torneo.getNombre());

		for (Inscripcion inscripcion : torneo.getInscripciones()) {
			if (inscripcion.getEstado() == EstadoInscripcion.ACTIVA) {
				Socio socio = inscripcion.getSocio();
				informe.agregarSocio(new DatosInformeSocio(socio.getNumero(), socio.getNombre(), torneo.getNombre()));
			}
		}

		return informe;
	}

}
