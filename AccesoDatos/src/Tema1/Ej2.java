package Tema1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la ruta de un fichero o carpeta: ");
		
		String nombreFichero = teclado.nextLine();
		
		File ejemplo2 = new File(nombreFichero);
		
		try {
			
			if (ejemplo2.exists()) {
				
				if (ejemplo2.isDirectory()) {
					
					System.out.println("Es una carpeta:");
					System.out.println("Tamaño: "+ejemplo2.length());
					
				}if (ejemplo2.isFile()) {
					
					System.out.println("Es una fichero:");
					System.out.println("Tamaño: "+ejemplo2.length());
				}	
			}else {
				System.out.println("Error.");
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error.");
		}
		
		

	}

}
