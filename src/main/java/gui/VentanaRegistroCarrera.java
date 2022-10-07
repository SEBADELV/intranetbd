package gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import controller.UniversidadController;
import model.Carrera;

public class VentanaRegistroCarrera extends Ventana {
    private JLabel textoEncabezado, textoCodigo, textoCarrera, textoSemestres;
    private JTextField campoCodigo, campoCarrera, campoSemestres;
    private JButton botonRegistrar, botonCancelar;
	private UniversidadController universidad;

    public VentanaRegistroCarrera(UniversidadController universidad) {
        super("Registro de Carrera", 500, 520);
        this.universidad= universidad;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoSemestres();
        generarCampoCarrera();
        generarCampoCodigo();
    }
    private void generarEncabezado() {
        String textoCabecera = "Registro de Carrera";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);

    }
    private void generarBotonRegistrar() {
        String textoBoton= "Registrar Carrera";
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
    private void generarCampoCarrera(){
        String textoCarrera= "Nombre de carera:";
        super.generarJLabel(this.textoCarrera,textoCarrera,20,50,150,20);
        this.campoCarrera= super.generarJTextField(200,50,250,20);
        this.add(this.campoCarrera);
    }
    private void generarCampoCodigo(){
        String textoCodigo= "Codigo carrera:";
        super.generarJLabel(this.textoCodigo,textoCodigo,20,100,150,20);
        this.campoCodigo= super.generarJTextField(200,100,250,20);
        this.add(this.campoCodigo);
    }
    private void generarCampoSemestres(){
        String textoSemestres= "Cantidad de semestres :";
        super.generarJLabel(this.textoSemestres,textoSemestres,20,150,150,20);
        this.campoSemestres= super.generarJTextField(200,150,250,20);
        this.add(this.campoSemestres);
    }
    private boolean registrarCarrera(){
        return universidad.añadirCarrera(this.campoCarrera.getText(),this.campoCodigo.getText(), Integer.parseInt(this.campoSemestres.getText()));
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrar) {
            if(registrarCarrera()) {
                JOptionPane.showMessageDialog(this,"Carrera registrada correctamente");
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