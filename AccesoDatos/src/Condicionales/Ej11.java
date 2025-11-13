package Condicionales;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número del 1 al 7: ");
		
		Scanner teclado = new Scanner (System.in);
		
		int num = teclado.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("Hoy es lunes.");
			break;
			
		case 2:
			System.out.println("Hoy es martes.");
			break;
			
		case 3:
			System.out.println("Hoy es miércoles.");
			break;
			
		case 4:
			System.out.println("Hoy es jueves.");
			break;
			
		case 5:
			System.out.println("Hoy es viernes.");
			break;
			
		case 6:
			System.out.println("Hoy es sábado.");
			break;
			
		case 7:
			System.out.println("Hoy es domingo.");
			break;

		default:
			break;
		}

	}

}
