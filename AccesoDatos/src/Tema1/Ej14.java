package Tema1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la ruta del fichero del fichero: ");
		
		String ruta = teclado.nextLine();

		// Declaramos el stream de lectura
		BufferedReader fichero = null;

		// Si el fichero no existe se lanza una excepción que hay que capturar
		try {
			
			// Abrimos el fichero
			fichero = new BufferedReader(new FileReader(ruta));

			// Variable para ir leyendo los caracteres del fichero
			String linea;

			// Bucle de lectura del fichero
			System.out.println("Contenido del fichero:");

			while ((linea = fichero.readLine()) != null) {

				System.out.println(linea);
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

	}

}
