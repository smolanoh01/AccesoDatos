package Tema1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el fichero que desea crear, con su correspondiente ruta: ");
		
		String file = teclado.nextLine();
		
		File fichero = new File (file);
		
		try {
			if (fichero.exists()) {
				
				System.out.println("El fichero ya existe.");
				
			} else {
				
				fichero.createNewFile();
				System.out.println("Fichero creado con éxito.");

			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
