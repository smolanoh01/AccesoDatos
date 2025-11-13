package Tema1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del fichero: ");
		
		String nombreFichero = teclado.nextLine();
		
		File fichero = new File(nombreFichero);
		
		System.out.println("Introduzca los datos que desea añadir: ");
		
		String datos = teclado.nextLine();
		
		try {
			
			if (fichero.exists()) {
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero,true));
				bw.newLine();
				bw.write(datos);
				bw.close();
				
			} else {
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero,true));
				bw.write(datos);
				bw.close();

			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
