package JSON;

import java.util.ArrayList;

public class Recetas {
	
	ArrayList<Receta> recetas = new ArrayList<Receta>();

	public Recetas() {
		super();
	}

	public ArrayList<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}

	public void mostrarRecetas() {
		
		for (Receta r : recetas) {
			
			System.out.println(r.toString());
			
		}
	}
	

}
