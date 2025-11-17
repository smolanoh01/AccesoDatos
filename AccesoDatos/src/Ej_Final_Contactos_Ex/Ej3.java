package Ej_Final_Contactos_Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leemos ambos ficheros y los almacenamos en objetos de la clase ListaPersonas
		try {
			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("personas1.obj"));
			ListaPersonas lista1 = (ListaPersonas) ois1.readObject();
			ois1.close();

			// Mostrar lista (comprobación)
			//lista1.mostrarPersonas();

			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("personas2.obj"));
			ListaPersonas lista2 = (ListaPersonas) ois2.readObject();
			ois2.close();

			// Mostrar lista (comprobación)
			//lista2.mostrarPersonas();
			
			//Unificamos la listas
			//Creamos una tercera lista que almacenará los objetos fusionados
			ListaPersonas listaFinal = new ListaPersonas();
			
			//Comprabmos coincidencias
			for (Persona p1 : lista1.getPersonas()) {
				for (Persona p2 : lista2.getPersonas()) {
					
					if (p1.getDni().equals(p2.getDni())) {
						
						p2.setNombre(p1.getNombre());
						p2.setEdad(p1.getEdad());
						
						//Añadimos el objeto a la lista
						listaFinal.annadirPersona(p2);
								
					}
				}
			}
			
			//Mostrar lista comprobación
			listaFinal.mostrarPersonas();
			
			//Guardamos la lista en un fichero binario
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.obj", true));
			oos.writeObject(listaFinal);
			oos.close();

			System.out.println("Lista almacenada correctamente.");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
