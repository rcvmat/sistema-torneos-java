package informes;

import java.util.ArrayList;
import java.util.List;

public class SociosActivosPorTorneo {

	private String nombreTorneo;
	private List<DatosInformeSocio> socios;

	public SociosActivosPorTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
		this.socios = new ArrayList<>();
	}

	public void agregarSocio(DatosInformeSocio datos) {
		socios.add(datos);
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public List<DatosInformeSocio> getSocios() {
		return socios;
	}

}
