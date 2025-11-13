package Tema1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ej26_Leer_Escribir_Objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreArchivo = "empleado.bin";
		
		Empleado empleado = new Empleado("123456789A","Sergio",1200);
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
			
			oos.writeObject(empleado);
			
			System.out.println("Empleado guardado correctamente.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(nombreArchivo));
			
			empleado = (Empleado) ois.readObject();
			
			System.out.println(empleado.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
