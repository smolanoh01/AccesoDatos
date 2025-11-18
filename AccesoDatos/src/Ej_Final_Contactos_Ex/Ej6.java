package Ej_Final_Contactos_Ex;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ej6 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Abrimos fichero binario
		try {
			RandomAccessFile archivo = new RandomAccessFile("telefonos.bin", "rw");

			// Leemos el dni que introduce el usuario
			System.out.println("Introduzca el dni: ");

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

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
