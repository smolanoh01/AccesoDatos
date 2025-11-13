package Objetos;

import java.util.ArrayList;

public class Alumno {
	
	public Alumno(int expediente, String nombre, String apellidos) {
		super();
		this.expediente = expediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Alumno() {
		super();
	}
	
	private int expediente;
	private String nombre,apellidos;
	private ArrayList<Double> lista = new ArrayList<Double>();
	
	public int getExpediente() {
		return expediente;
	}
	
	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public ArrayList<Double> getLista() {
		return lista;
	}
	
	public void setLista(ArrayList<Double> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Alumno [expediente=" + expediente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", lista="
				+ lista + "]";
	}
	
	public void añadirNota(double num) {
		
		this.lista.add(num);
	}
	
	public double calcularNota() {
		
		double suma = 0;
		
		for (Double nota : lista) {
			
			suma = suma + nota;
		}
		
		return suma/lista.size();
	}

}
