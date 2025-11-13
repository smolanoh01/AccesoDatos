package Tema1;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Ej7 {
	
	public static void mostrarInformacion(File nf) {
		
		System.out.println("====================================");
		System.out.println(nf.getName());											//Nombre del fichero
		System.out.println("====================================");
		System.out.println("Fichero existe.");										//Ya comprobado en el programa principal
		
		if (nf.isDirectory()) {														//Carpeta / Fichero
			
			System.out.println("Fichero: false | Carpeta: true");
			
		}else {
			
			System.out.println("Fichero: true | Carpeta: false");
		}
		
		
		System.out.println("Nombre del fichero: "+nf.getAbsolutePath());			//Ruta del fichero
		
		if (nf.canRead()) {															//Permisos
			System.out.printf("r");
		}else {
			System.out.printf("-");
		}
		
		if (nf.canExecute()) {
			System.out.printf("x");
		} else {
			System.out.printf("-");
		}
		
		if (nf.canWrite()) {
			System.out.printf("w");
		} else {
			System.out.printf("-");
		}
		
		System.out.println();
		
		System.out.println("Tamaño: "+nf.length());									//Tamaño del fichero
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<File> lista = new HashSet<File>();									//Lista sin duplicados para almacenar ficheros
		
		String entrada;
		
		Scanner teclado = new Scanner (System.in);
		
		boolean encendido = true;
		
		do {
			
			System.out.println("\nMenú");
			System.out.println("- - - - - - - - - -");
			System.out.println("Introduce nombres de fichero (con su ruta correspondiente) / Escribe 'salir' para terminar:");
			System.out.println("Nombre de fichero: ");
			
			entrada = teclado.nextLine();
			
			File fichero = new File(entrada);
			
			if (entrada.equalsIgnoreCase("salir")) {								//Salida del bucle
				
				encendido = false;
				
			}else if (fichero.exists()) {											//Comprueba la existencia del fichero antes de añadir
				
				lista.add(fichero);
				
				System.out.println("Fichero añadido.");
				
			}else {
				
				System.out.println("La entrada introducida no corresponde a nigún fichero.");
			}
				
			
		} while (encendido);
		
		if (lista.isEmpty()) {														//Comprueba si la lista no está vacía
			
			System.out.println("La lista no contiene nigún fichero.");
			
		}else {
			
			for (File f : lista) {													//Recorre la lista de ficheros mostrando la informacion de cada uno
				
				mostrarInformacion(f);
				
			}
			
		}

	}

	

}
