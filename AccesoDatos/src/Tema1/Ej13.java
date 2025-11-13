package Tema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fichero = null;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la ruta del fichero del fichero: ");
		
		String ruta = teclado.nextLine();
		
		File f = new File (ruta);
		
		try {
			// Abrimos el fichero para lectura
			fichero = new FileReader(ruta);

			// Variable para ir leyendo los caracteres del fichero
			char letra;
			int caracter;

			// Recorremos para mostrar el contenido
			while ((caracter = fichero.read()) != -1) {

				// mostramos el carácter leído
				letra = (char) caracter;
				System.out.print(letra);
			}

		} catch (FileNotFoundException e) {

			System.out.println("Fichero no encontrado");
			e.printStackTrace();
			
		} catch (IOException e) {

			System.out.println("Error al leer");
			e.printStackTrace();
		}

		finally {
			// Cerramos el fichero
			try {
				fichero.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		
	

	}

}
