package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej35 {
	
	public static void añadirElemento(ArrayList<String> l) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el elemento que quiere añadir: ");
		l.add(teclado.nextLine());
	}
	
	public static void borrarElemento(ArrayList<String> l) {
		
		Scanner teclado = new Scanner (System.in);
		
		String elemento;
		
		System.out.println("Introduzca el elemento que desea eliminar: ");
		
		elemento = teclado.nextLine();
		
		if (l.contains(elemento)) {
			
			l.remove(elemento);
			System.out.println("Eliminando...\n");
			
		}else {
			System.out.println("El elemento que ha introducido no se encuentra en el listado.\n");
		}
		
	}
	
	public static void listar(ArrayList<String> l) {
		
		for (String s : l) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		ArrayList<String> lista = new ArrayList<String>();
		
		boolean encendido = true;
		int valor;
		
		
		lista.add("Sergio");
		lista.add("Carlos");
		lista.add("Ouriol");
		
		do {
			
			System.out.println("\nMenú");
			System.out.println("- - - - - - - - - -");
			System.out.println("1.-Añadir elemento \n2.-Borrar elemento \n3.-Listar \n4.-Salir\n");
			System.out.println("Introduzca uno de los valores: ");
			
			valor = Integer.parseInt(teclado.nextLine());
			
			
			switch (valor) {
			case 1:
				añadirElemento(lista);
				break;
			
			case 2:
				borrarElemento(lista);
				break;
				
			case 3:
				listar(lista);
				break;
				
			case 4:
				System.out.println("Saliendo del programa...");
				encendido = false;

			default:
				System.out.println("Opción no válida.");
				break;
			}
			
		} while (encendido);

	}

}
