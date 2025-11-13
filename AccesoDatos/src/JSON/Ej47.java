package JSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ej47 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear objeto ObjectMapper
		ObjectMapper mapper = new ObjectMapper();

		try {
			Recetas receta = mapper.readValue(new File("ej46recetas.json"), Recetas.class);

			ArrayList<Receta> listaRecetas = new ArrayList<>(receta.getRecetas());

			boolean salir = false;
			boolean salida = false;

			do {

				System.out.println("\nMenú");
				System.out.println("- - - - - - - - - -");
				System.out.println("1.-Nueva receta \n2.-Mostrar recetas \n3.-Borrar receta \n4.-Salir\n");
				System.out.println("Introduzca uno de los valores: ");

				int valor = Integer.parseInt(teclado.nextLine());

				switch (valor) {
				case 1:
					
					System.out.println("Introduce los datos de la receta que deseas añadir: ");
					Receta r = new Receta();
					
					//Datos de la receta
					System.out.println("Introduce el nombre: ");
					r.setNombre(teclado.nextLine());
					System.out.println("Introduce el tipo: ");
					r.setTipo(teclado.nextLine());
					
					//Datos de origen
					System.out.println("Introduce el país de origen: ");
					r.getOrigen().setPais(teclado.nextLine());
					System.out.println("Introduce la región de origen: ");
					r.getOrigen().setRegion(teclado.nextLine());
					
					//Datos de ingredientes
					do {
						Ingrediente i = new Ingrediente();
						System.out.println("Introduzca el nombre del ingrediente: ");
						i.setNombre(teclado.nextLine());
						System.out.println("Introduzca la cantidad: ");
						i.setCantidad(teclado.nextLine());
						r.getIngredientes().add(i);
						
						System.out.println("Introduzca 1 si desea añadir más ingredientes / Introduzca 0 si no: ");
						if (Integer.parseInt(teclado.nextLine()) == 0) {
							salida = true;
						}
						
					} while (salida == false);
					
					listaRecetas.add(r);
					System.out.println("Receta añadida.");
					
					break;

				case 2:
					
					System.out.println("Lista de recetas: \n");
					for (Receta rec : listaRecetas) {
						
						System.out.println("Nombre: "+rec.getNombre());
						System.out.println("Tipo: "+rec.getTipo());
						System.out.println("Origen: \n\tPais: "+rec.getOrigen().getPais()+ "\n\tRegion: "+rec.getOrigen().getRegion());
						
						//Informacion de los ingredientes
						
						System.out.println("Ingredientes: ");
						for (Ingrediente i : rec.getIngredientes()) {
							
							System.out.println("\tNombre: "+i.getNombre());
							System.out.println("\tCantidad: "+i.getCantidad()+"\n");
						}
						
						System.out.println("- - - - - - - - - - - - - - - - - \n");
					}
					break;

				case 3:
					
					System.out.println("Introduzca el nombre de la receta que desea eliminar: ");
					String nombreReceta = teclado.nextLine();
					
					for (Receta receta2 : listaRecetas) {
						
						if (nombreReceta.equalsIgnoreCase(receta2.getNombre())) {
							
							listaRecetas.remove(receta2);
							System.out.println("Receta eliminada.");
						}
					}
				
					break;

				case 4:
					System.out.println("Saliendo del programa...");
					salir = true;
					break;

				default:
					System.out.println("Opción inválida.");
					break;
				}

			} while (salir == false);

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
