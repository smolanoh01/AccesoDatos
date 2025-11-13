package Tema1;

import java.io.File;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca la ruta del fichero a modificar: ");
		
		String ruta = teclado.nextLine();
		
		System.out.println("Introduce el nuevo nombre para el fichero: ");
		
		String newName = teclado.nextLine();
		
		File fichero = new File (ruta);
		
		File fichenom = new File (newName);
		
		fichero.renameTo(fichenom);
		
		System.out.println("Fichero renombrado con éxito.");
		

	}

}
