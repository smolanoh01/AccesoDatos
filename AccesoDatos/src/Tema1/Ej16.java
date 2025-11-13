package Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej16 {
	
	public static int mostrarFichero(File nombreFichero) {
		
		BufferedReader fichero = null;
		
		int numFilas = 0;

		// Si el fichero no existe se lanza una excepción que hay que capturar
		try {
			
			// Abrimos el fichero
			fichero = new BufferedReader(new FileReader(nombreFichero));

			// Variable para ir leyendo los caracteres del fichero
			String linea;

			// Bucle de lectura del fichero
			while ((linea = fichero.readLine()) != null) {

				System.out.println(linea);
				
				numFilas++;
			}

		} catch (Exception e) {

			System.out.println("Error al abrir el fichero");
			e.getMessage();
			e.printStackTrace();
			
		} finally {

			try {

				fichero.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		return numFilas;
		
	}
	
	public static void modificarFichero(File nombreFichero, int numLinea) {
		
		try {
			
			BufferedReader FOriginal = new BufferedReader(new FileReader(nombreFichero));
			
			File Ftemporal = new File("tmp.txt");
			
			BufferedWriter Ftmp = new BufferedWriter(new FileWriter(Ftemporal));
			
			String linea;
			int lineaActual = 1;
			
			while ((linea = FOriginal.readLine()) != null) {

				if (lineaActual != numLinea) {
					
					Ftmp.append(linea);
					Ftmp.newLine();
					
				}
				
				lineaActual++;
			}
			
			FOriginal.close();
			Ftmp.close();
			
			if (nombreFichero.delete()) {
				
				Ftemporal.renameTo(nombreFichero.getAbsoluteFile());
				
			}else {
				
				System.out.println("No se puede borrar el fichero original.");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la ruta del fichero del fichero: ");
		
		String ruta = teclado.nextLine();
		
		File fichero = new File(ruta);
		
		int numFilas = mostrarFichero(fichero);
		
		System.out.println("¿Que linea desea borrar?: ");
		
		int lineaBorrar = teclado.nextInt();
		
		if (lineaBorrar > 0 || lineaBorrar <= numFilas) {
			
			modificarFichero(fichero, lineaBorrar);
			
		} else {
			
			System.out.println("Error");

		}
		
		System.out.println("Fichero modificado: ");
		
		mostrarFichero(fichero);

	}

}
