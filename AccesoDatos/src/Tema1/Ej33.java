package Tema1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ej33 {

	public static Scanner teclado = new Scanner(System.in);

	public static void altaProducto(RandomAccessFile archivo) {

		System.out.println("Introduce el id del producto: ");
		int id = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el nombre del producto: ");
		String nombre = teclado.nextLine();

		System.out.println("Introduce el precio del producto: ");
		double precio = Double.parseDouble(teclado.nextLine());

		System.out.println("Introduce el stock del producto: ");
		int stock = Integer.parseInt(teclado.nextLine());

		// Nombre de producto tiene que ocupar 20 caracteres
		if (nombre.length() < 20) {
			while (nombre.length() < 20) {
				nombre += " ";
			}
		}

		// Escribir los datos en el archivo binario
		try {
			archivo.writeInt(id);
			archivo.writeBytes(nombre);
			// archivo.writeChars(n);
			// archivo.writeUTF(n);
			archivo.writeDouble(precio);
			archivo.writeInt(stock);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void mostrarLista(RandomAccessFile archivo) {
		// TODO Auto-generated method stub

		try {

			try {

				archivo.seek(0);

				while (true) {
					// Leer codigo
					int codigo = archivo.readInt();

					// Leer el nombre

					byte[] nombreBytes = new byte[20];

					archivo.read(nombreBytes);

					String nombre = new String(nombreBytes);

					nombre.trim();

					// Leer el precio

					double precio = archivo.readDouble();

					// Leer la cantidad en stock

					int cantidad = archivo.readInt();

					// Mostrar los datos leidos

					System.out.println("Producto: " + codigo);

					System.out.println("Nombre: " + nombre);

					System.out.println("Precio: " + precio);

					System.out.println("Cantidad en stock: " + cantidad);

					System.out.println("- - - - - - - - - - - - - - - - - -");
				}
			} catch (EOFException e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void modificarStock(RandomAccessFile archivo) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el id del producto del cual desea modificar el stock: ");
		int id = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el nuevo stock del producto: ");
		int stock = Integer.parseInt(teclado.nextLine());
		try {

			try {

				archivo.seek(0);

				while (true) {
					// Leer codigo
					int codigo = archivo.readInt();
					
					
					if (id == codigo) {
						
						archivo.skipBytes(28);
						archivo.writeInt(stock);
						
						
					} else {
						
						archivo.readInt();//saltas el stock
					}

				

					
				}
			} catch (EOFException e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean encendido = true;
		int valor;

		RandomAccessFile archivo = null;
		try {
			archivo = new RandomAccessFile("ListaProductos.dat", "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		do {

			System.out.println("\nMenú");
			System.out.println("- - - - - - - - - -");
			System.out.println(
					"1.-Dar de alta un producto \n2.-Mostrar una lista de todos los productos \n3.-Modificar el stock de un producto \n4.-Borrar producto \n5.-Salir\n");
			System.out.println("Introduzca uno de los valores: ");

			valor = Integer.parseInt(teclado.nextLine());

			switch (valor) {
			case 1:
				altaProducto(archivo);
				break;

			case 2:
				mostrarLista(archivo);
				break;

			case 3:
				modificarStock(archivo);
				break;

			case 4:

				break;

			case 5:
				System.out.println("Saliendo del programa...");
				encendido = false;
				break;

			default:
				System.out.println("Opción no válida.");
				break;
			}

		} while (encendido);

	}

}
