package Tema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File(".");
			
			System.out.println(file.getAbsolutePath());
			
//			if (file.createNewFile()) {
//				
//				System.out.println("Fichero creado correctamente.");
//				System.out.println(file.getAbsolutePath());
//				
//			}else {
//				
//				System.out.println("Ya existe el fichero.");
//			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
