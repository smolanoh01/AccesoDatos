package Tema1;

import java.io.File;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la ruta de una carpeta: ");
		
		String ruta = teclado.nextLine();
		
		File fichero = new File (ruta);
		
		if (fichero.exists()) {
			
			if (fichero.isDirectory()) {
				
				for (File f : fichero.listFiles()) {
					System.out.println(f.getName());
					
					if (f.canRead()) {
						System.out.printf("r");
					}else {
						System.out.printf("-");
					}
					
					if (f.canExecute()) {
						System.out.printf("x");
					} else {
						System.out.printf("-");
					}
					
					if (f.canWrite()) {
						System.out.printf("w");
					} else {
						System.out.printf("-");
					}
					
					System.out.println();
				}
			}else {
				System.out.println("No es una carpeta.");
			}
			
		}else {
			
			System.out.println("Ruta errónea.");
		}
	}

}
