package Ej_Final_Contactos_Ex;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ej5 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois1;
		try {
			ois1 = new ObjectInputStream(new FileInputStream("personas.obj"));
			ListaPersonas listaP = (ListaPersonas) ois1.readObject();
			ois1.close();

			// Mostrar lista (comprobación)
			listaP.mostrarPersonas();

			// Escribimos en fichero binario
			RandomAccessFile archivo = new RandomAccessFile("telefonos.bin", "rw");

			for (Persona p : listaP.getPersonas()) {

				if (p.getDni().length() < 9) {
					while (p.getDni().length() < 9) {
						p.setDni(p.getDni() + " ");
					}

				}

				archivo.writeBytes(p.getDni());
				archivo.writeInt(p.getTelefono());
			}

			//Ej 6 
			System.out.println("Introduce el dni que desea buscar: ");

			String dni = teclado.nextLine();

			try {
				archivo.seek(0);
				while (true) {

					// Leer dni
					byte[] dniBytes = new byte[9];
					archivo.read(dniBytes);
					String dni2 = new String(dniBytes);
					dni2.trim();

					if (dni.equals(dni2)) {

						int tlf = archivo.readInt();
						System.out.println("Telefono: " + tlf);
						break;

					} else {

						archivo.skipBytes(4);
					}
				}

			} catch (EOFException e) {
				// TODO: handle exception
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
