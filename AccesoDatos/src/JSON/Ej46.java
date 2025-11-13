package JSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ej46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear objeto ObjectMapper
		ObjectMapper mapper = new ObjectMapper();

		// Leer fichero JSON y convertirlo en una lista de recetas
		try {
			Recetas receta = mapper.readValue(new File("ej46recetas.json"), Recetas.class);
			
			ArrayList<Receta> listaRecetas = new ArrayList<>(receta.getRecetas());
			
			//Datos de las recetas
			for (Receta r : listaRecetas) {
				
				System.out.println("Nombre: "+r.getNombre());
				System.out.println("Tipo: "+r.getTipo());
				System.out.println("Origen: \n\tPais: "+r.getOrigen().getPais()+ "\n\tRegion: "+r.getOrigen().getRegion());
				
				//Informacion de los ingredientes
				
				System.out.println("Ingredientes: ");
				for (Ingrediente i : r.getIngredientes()) {
					
					System.out.println("\tNombre: "+i.getNombre());
					System.out.println("\tCantidad: "+i.getCantidad()+"\n");
				}
				
				System.out.println("- - - - - - - - - - - - - - - - - \n");
			}
			
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
