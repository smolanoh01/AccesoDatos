package Tema1;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejemplo_RandomAccess2 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//Crear o abrir un archivo para escribir
			RandomAccessFile archivo = new RandomAccessFile("numeros.txt", "rw");
			
			//Escribir datos en el archivo
			archivo.writeInt(1);
			archivo.writeDouble(5.5);
			
			archivo.writeInt(2);
			archivo.writeDouble(7.5);
			
			archivo.writeInt(3);
			archivo.writeDouble(9.5);
			
			//Variables
			int numPosicion;
			double valor;
			
			//Solicitar al usuario el nombre del fichero
			System.out.println("Introduce el orden de la nota a buscar: ");
			int numLeer = Integer.parseInt(teclado.nextLine());
			
			//Ir al inicio del arhcivo
			archivo.seek(0);
			
			//Bucle para leer todos los datos
			try {
				
				while(true) {
					
					numPosicion = archivo.readInt();
					//valor = archivo.readDouble();
					
					if (numPosicion == numLeer) {
						
						valor = archivo.readDouble();
						System.out.println("Numero encontrado :" + numPosicion + " , valor:  " + valor);
						break;
					}else {
						
						archivo.skipBytes(8);
					}
					
				}
			} catch (EOFException e) {
				System.out.println("Fin del archvio.");
			}
			
			//Cerrar el archivo
			archivo.close();
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
