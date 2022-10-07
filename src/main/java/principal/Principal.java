package principal;

import controller.UniversidadController;
import gui.VentanaBienvenida;

public class Principal {
    public static void main(String[] args) {
        UniversidadController universidad = new UniversidadController();
        VentanaBienvenida ventana = new VentanaBienvenida(universidad);
    }
}