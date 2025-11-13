package Tema1;

import java.io.File;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca la carpeta que desea crear, con su correspondiente ruta: ");
		
		String carpeta = teclado.nextLine();
		
		File fichero = new File (carpeta);
		
		if (fichero.exists()) {
			
			System.out.println("La carpeta ya existe.");
			
		} else {
			
			fichero.mkdir();
			System.out.println("Carpeta creada con éxito.");

		}

	}

}
