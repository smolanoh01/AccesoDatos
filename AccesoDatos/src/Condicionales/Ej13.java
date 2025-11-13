package Condicionales;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce tu calificación: ");
		
		Scanner teclado = new Scanner (System.in);
		
		int nota = teclado.nextInt();
		
		switch (nota) {
		
		case 0,1,2,3,4:
			
			System.out.println("Insuficiente.");
			break;
			
		case 5:
			
			System.out.println("Suficiente.");
			break;
			
		case 6:
			
			System.out.println("Bien.");
			break;
			
		case 7,8:
			
			System.out.println("Notable.");
			break;
			
		case 9,10:
			
			System.out.println("Sobresaliente.");
			break;

		default:
			break;
		}

	}

}
