package app;

import informes.DatosInformeSocio;
import informes.SociosActivosPorTorneo;
import modelo.Socio;
import modelo.Torneo;
import servicios.ServicioTorneo;

public class Main {

	public static void main(String[] args) {

		ServicioTorneo servicio = new ServicioTorneo();

		Torneo torneo = new Torneo("Torneo Verano");
		servicio.agregarTorneo(torneo);

		Socio socio1 = new Socio(1, "Juan");
		Socio socio2 = new Socio(2, "Ana");

		servicio.inscribirSocio("Torneo Verano", socio1);
		servicio.inscribirSocio("Torneo Verano", socio2);
		servicio.darDeBajaSocio("Torneo Verano", 1);

		SociosActivosPorTorneo informe = servicio.obtenerSociosActivos("Torneo Verano");

		if (informe != null) {
			System.out.println("Socios activos en " + informe.getNombreTorneo());
			for (DatosInformeSocio dato : informe.getSocios()) {
				System.out.println(dato.getNumeroSocio() + " - " + dato.getNombreSocio());
			}
		}

		System.out.println("Sistema funcionando correctamente");
	}
}
