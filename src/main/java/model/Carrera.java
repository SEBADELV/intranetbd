package model;

public class Carrera {
    private String nombre;
    private String codigo;
    private int cantidadDeSemestres;

    public Carrera(String nombre, String codigo, int cantidadDeSemestres) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadDeSemestres = cantidadDeSemestres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDeSemestres() {
        return cantidadDeSemestres;
    }

    public void setCantidadDeSemestres(int cantidadDeSemestres) {
        this.cantidadDeSemestres = cantidadDeSemestres;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cantidadDeSemestres=" + cantidadDeSemestres +
                '}';
    }
}