package Ej_Final_Contactos_Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leemos el fichero personas.obj y lo guardamos en una lista
		ObjectInputStream ois1;
		try {
			ois1 = new ObjectInputStream(new FileInputStream("personas.obj"));
			ListaPersonas listaP = (ListaPersonas) ois1.readObject();
			ois1.close();

			// Mostrar lista (comprobación)
			listaP.mostrarPersonas();

			BufferedWriter bw = new BufferedWriter(new FileWriter("contactos.csv"));

			// Escribimos las distintas filas
			for (Persona p : listaP.getPersonas()) {
				bw.write(p.getNombre() + ";" + p.getEmail() + "\n");
			}
			bw.close();

			// Leer fichero comprobación
			BufferedReader br = new BufferedReader(new FileReader("contactos.csv"));
			// Variable para ir leyendo los caracteres del fichero
			String linea;
			// Bucledelecturadelfichero
			System.out.println("Contenido del fichero :");
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
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
