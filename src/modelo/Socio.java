package modelo;

public class Socio {

    private int numero;
    private String nombre;

    public Socio(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
