package M3_Voraces.M3_Subutilidades;

public class Producto {
    private int nombre;
    private int peso;

    Producto (int nombre, int peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    public Producto() {
    }

    public int getNombre() {
        return nombre;
    }


    public int getPeso() {
        return peso;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}