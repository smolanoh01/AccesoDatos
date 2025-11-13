package JSON;

import java.util.ArrayList;

public class Receta {
	
	private String nombre;
	private String tipo;
	private Origen origen;
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	public Receta(String nombre, String tipo, Origen origen, ArrayList<Ingrediente> ingredientes) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.origen = origen;
		this.ingredientes = ingredientes;
	}

	public Receta() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", tipo=" + tipo + ", origen=" + origen + ", ingredientes=" + ingredientes
				+ "]";
	}
	
	
	
	
	

}
