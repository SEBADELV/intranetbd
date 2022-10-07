package gui;

import controller.UniversidadController;
import model.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
public class VentanaRegistroEstudiante extends Ventana{
    private JLabel textoEncabezado, textoRut, textoNombre, textoMatricula,textoApellido,textoCarrera;
    private JTextField campoNombre, campoRut, campoMatricula, campoApellido;
    private JButton botonRegistrar, botonCancelar;
    private JComboBox listaCarrera;
    private UniversidadController universidad;

    public VentanaRegistroEstudiante(UniversidadController universidad) {
        super("Registro de Estudiante", 500, 520);
        this.universidad= universidad;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoMatricula();
        generarCampoNombre();
        generarCampoRut();
        generarCampoApellido();
    }
    private void generarEncabezado() {
        String textoCabecera = "Registro de Estudiante";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);

    }
    private void generarBotonRegistrar() {
        String textoBoton= "Registrar Estudiante";
        this.botonRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonRegistrar);
        this.botonRegistrar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonCancelar = "Cancelar";
        this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }
    private void generarCampoNombre(){
        String textoNombre= "Nombre:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.campoNombre= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombre);
    }
    private void generarCampoApellido(){
        String textoApellido= "Apellido:";
        super.generarJLabel(this.textoApellido,textoApellido,20,100,150,20);
        this.campoApellido= super.generarJTextField(200,100,250,20);
        this.add(this.campoApellido);
    }
    private void generarCampoRut(){
        String textoRut= "Rut:";
        super.generarJLabel(this.textoRut,textoRut,20,150,150,20);
        this.campoRut= super.generarJTextField(200,150,250,20);
        this.add(this.campoRut);
    }
    private void generarCampoMatricula(){
        String textoMatricula= "N de matricula :";
        super.generarJLabel(this.textoMatricula,textoMatricula,20,200,150,20);
        this.campoMatricula= super.generarJTextField(200,200,250,20);
        this.add(this.campoMatricula);
    }
    private void generarListaCarrera(){
        super.generarJLabel(this.texto,"Marca vehículo:",20,100,100,20);
        String [] arreglo = new String[]{"hola","chao"};
        this.listaMarcaVehiculo=super.generarListaDesplegable(arreglo,120,100, 100, 20);
        this.add(this.listaMarcaVehiculo);
    }
    private boolean registrarEstudiante(){
        return universidad.añadirEstudiante(this.campoNombre.getText(),this.campoApellido.getText(),this.campoRut.getText(), this.campoMatricula.getText());
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrar) {
            if(registrarEstudiante()) {
                JOptionPane.showMessageDialog(this,"Estudiante registrado correctamente");
                VentanaBienvenida ventanaBienvenida = new VentanaBienvenida(universidad);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Ya existe la carrera");
            }

        }
        if (e.getSource() == this.botonCancelar){
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida(universidad);
            this.dispose();
        }

    }
}