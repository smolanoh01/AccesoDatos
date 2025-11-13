package Tema1;

import java.io.File;
import java.util.Scanner;

public class Ej8 {
	
	public static void buscarHijos(File f) {
		
		for (File fich : f.listFiles()) {
			
			if (fich.isDirectory()) {
				
				System.out.println("[D]" + fich.getName());
				
				File newFile = new File(fich.getAbsolutePath());
				
				buscarHijos(newFile);
				
			} else {
				
				System.out.println("[F]" + fich.getName());
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la ruta de una carpeta: ");
		
		String ruta = teclado.nextLine();
		
		File carpeta = new File (ruta);
		
		if (carpeta.isDirectory()) {
			
			buscarHijos(carpeta);
			
		} else {
			
			System.out.println("No es una carpeta.");

		}

	}

}
