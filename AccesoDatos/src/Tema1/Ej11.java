package Tema1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del fichero que desea crear: ");
		
		String nombreFichero = teclado.nextLine();
		
		File fichero = new File(nombreFichero);
		
		try {
			
			fichero.createNewFile();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Introduzca el texto que desea añadir al fichero: ");
		
		String texto = teclado.nextLine();
		System.out.println(texto);
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));
			
			bw.write(texto);
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
