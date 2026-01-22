package app;

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

        System.out.println("Sistema funcionando correctamente");
    }
}

