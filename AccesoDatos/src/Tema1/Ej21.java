package Tema1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la ruta del fichero: ");

		String nombreArchivo = teclado.nextLine();

		int numero;

		do {

			System.out.println("Introduce un número del 32 al 126: ");
			numero = teclado.nextInt();

		} while (numero < 32 || numero > 126);

		try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
				DataOutputStream dos = new DataOutputStream(fos)) {

			// Escribir algunos datos en binario
			dos.writeInt(numero);

			System.out.println("Datos escritos correctamente en " + nombreArchivo);

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(nombreArchivo); DataInputStream dis = new DataInputStream(fis)) {

			// Leer los datos en el mismo orden que los escribimos
			int num = dis.readInt();
	
			System.out.println("Numero: " + num);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
