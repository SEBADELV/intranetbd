package controller;

import model.Carrera;
import model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class UniversidadController {
	private List<Estudiante> estudiantes;
	private List<Carrera> carreras;

	public UniversidadController() {
		this.estudiantes = new ArrayList<Estudiante>();
		this.carreras = new ArrayList<Carrera>();
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}
	public Estudiante buscarEstudiante(String nombre){
		Estudiante estudiante = null;
		for (Estudiante estudianteAux: this.estudiantes){
			if(estudianteAux.getNombre().equals(nombre)){
				estudiante = estudianteAux;
				break;
			}
		}
		return estudiante;
	}
	public Carrera buscarCarrera(String nombre) {
		Carrera carrera = null;
		for(Carrera carreraAux:this.carreras){
			if(carreraAux.getNombre().equals(nombre)){
				carrera =carreraAux;
				break;
			}
		}
		return carrera;
	}
	public Estudiante añadirEstudiante(String nombre, String apellido, String rut, String numeroMatricula){
			Estudiante estudiante = new Estudiante(nombre, apellido, rut, numeroMatricula);
			this.estudiantes.add(estudiante);
			return estudiante;
	}

	public boolean añadirCarrera(String nombre, String Codigo, int Semestre){
		if (this.buscarCarrera(nombre)==null) {
			Carrera carrera = new Carrera(nombre, Codigo, Semestre);
			this.carreras.add(carrera);
			return true;
		}
		return false;
		}

}
