package gui;

import controller.UniversidadController;
import model.Carrera;
import model.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaBusquedaEstudiante extends Ventana {
    private JButton botonBuscar, botonRegresar;
    private JLabel textoEncabezado, textoNombre, textoCarrera;
    private JComboBox listaCarrera;
    private JTextField campoNombre;
    private UniversidadController universidad;

    public VentanaBusquedaEstudiante(UniversidadController universidad) {

    }
}