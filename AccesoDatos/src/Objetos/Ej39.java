package Objetos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Ej39 {
	
	static LinkedHashMap<Integer, Alumno> mapa = new LinkedHashMap<Integer, Alumno>();
	
	
	
	public static void añadirElemento() {
		
		Scanner teclado = new Scanner (System.in);
		
		Alumno al = new Alumno();
		
		System.out.println("Introduzca el expediente del alumno: ");
		
		al.setExpediente(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("Introduzca el nombre del alumno: ");
		
		al.setNombre(teclado.nextLine());
		
		System.out.println("Introduzca el apellido del alumno: ");
		
		al.setApellidos(teclado.nextLine());
		
		mapa.put(al.getExpediente(), al);
		
		
	}
	
	public static void buscarElemento() {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el expediente del alumno que desea buscar: ");
		
		if (mapa.containsKey(teclado.nextInt())){
			
			System.out.println("Alumno encontrado.");
			
		}else {
			
			System.out.println("Expediente inexistente.");
		}
		
	}
	
	public static void borrarElemento() {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el expediente del alumno que desea eliminar: ");
		
		int expediente = Integer.parseInt(teclado.nextLine());
		
		if (mapa.containsKey(expediente)){
			
			mapa.remove(expediente);
			System.out.println("Alumno eliminado.");
			
		}else {
			
			System.out.println("Expediente inexistente.");
		}
	}
	
	public static void listar() {
		
		for (Entry<Integer, Alumno> entry : mapa.entrySet()) {
			Integer key = entry.getKey();
			Alumno val = entry.getValue();
			
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		boolean encendido = true;
		int valor;
		

		
		do {
			
			System.out.println("\nMenú");
			System.out.println("- - - - - - - - - -");
			System.out.println("1.-Añadir elemento \n2.-Buscar elemento \n3.-Borrar elemento \n4.-Listar \n5.-Salir\n");
			System.out.println("Introduzca uno de los valores: ");
			
			valor = Integer.parseInt(teclado.nextLine());
			
			
			switch (valor) {
			case 1:
				añadirElemento();
				break;
			
			case 2:
				buscarElemento();
				break;
				
			case 3:
				borrarElemento();
				break;
				
			case 4:
				listar();
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
