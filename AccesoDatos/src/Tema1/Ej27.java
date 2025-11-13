package Tema1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ej27 {

	public static Scanner teclado = new Scanner(System.in);

	public static void modificarFichero(File nombreArchivo) {

		try {

			System.out.println("Introduce el dni del empleado que desea eliminar: ");
			String dni = teclado.nextLine();

			boolean encontrado = false;

			// Lector fichero original
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo));

			File Ftemporal = new File("tmp.bin");

			// Writter para el fichero temporal
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Ftemporal));

			// Bucle para rellenar el fichero tmp
			try {

				while (true) {

					Empleado emp = (Empleado) ois.readObject();

					if (!emp.getDni().equals(dni)) {

						oos.writeObject(emp);

					}else {
						
						encontrado = true;
					}

					if (encontrado) {

						System.out.println("Empleado eliminado correctamente.");

					} else {

						System.out.println("El dni que ha introducido no corresponde a ningún empleado.");
					}

				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			// Borrado fichero original y rename del tmp
			if (nombreArchivo.delete()) {

				Ftemporal.renameTo(nombreArchivo.getAbsoluteFile());

			} else {

				System.out.println("No se puede borrar el fichero original.");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreArchivo = "empleado.bin";

		File fichero = new File(nombreArchivo);

		ObjectOutputStream oos = null;

		ObjectInputStream ois;

		boolean encendido = true;
		int valor;

		String dni;
		boolean encontrado;

		do {

			System.out.println("\nMenú");
			System.out.println("- - - - - - - - - -");
			System.out.println(
					"1.-Dar de alta empleado \n2.-Buscar empleados (DNI) \n3.-Listar empleados \n4.-Borrar empleados (DNI) \n5.-Salir\n");
			System.out.println("Introduzca uno de los valores: ");

			valor = Integer.parseInt(teclado.nextLine());

			switch (valor) {
			case 1:

				Empleado empleado = new Empleado();

				System.out.println("Introduce el DNI: ");
				empleado.setDni(teclado.nextLine());

				System.out.println("Introduce el nombre: ");
				empleado.setNombre(teclado.nextLine());

				System.out.println("Introduce el salario: ");
				empleado.setSueldo(Double.parseDouble(teclado.nextLine()));

				if (fichero.exists()) {

					try {

						MiObjectOutputStream mioos = new MiObjectOutputStream( new FileOutputStream(nombreArchivo, true));
						mioos.writeObject(empleado);

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {

					try {

						oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo, true));
						oos.writeObject(empleado);

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				break;

			case 2:

				try {

					ois = new ObjectInputStream(new FileInputStream(nombreArchivo));

					System.out.println("Introduce el dni que desea buscar: ");

					dni = teclado.nextLine();

					Empleado emp = new Empleado();

					encontrado = false;

					try {

						while (true) {

							emp = (Empleado) ois.readObject();

							if (emp.getDni().equals(dni)) {

								System.out.println("Empleado encontrado, " + emp.toString());
								encontrado = true;
							}

						}

					} catch (IOException | ClassNotFoundException e) {
						// TODO: handle exception

					}

					if (encontrado == false) {

						System.out.println("Empleado no disponible.");

					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 3:

				try {
					ois = new ObjectInputStream(new FileInputStream(nombreArchivo));

					Empleado emp = new Empleado();

					try {

						while (true) {

							emp = (Empleado) ois.readObject();

							System.out.println(emp.toString());

						}

					} catch (IOException | ClassNotFoundException e) {
						// TODO: handle exception

					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 4:
				modificarFichero(fichero);
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
