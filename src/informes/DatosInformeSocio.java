package informes;

public class DatosInformeSocio {

	private int numeroSocio;
	private String nombreSocio;
	private String nombreTorneo;

	public DatosInformeSocio(int numeroSocio, String nombreSocio, String nombreTorneo) {
		this.numeroSocio = numeroSocio;
		this.nombreSocio = nombreSocio;
		this.nombreTorneo = nombreTorneo;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public String getNombreSocio() {
		return nombreSocio;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

}
