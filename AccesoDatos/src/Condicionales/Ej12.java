package Condicionales;

import java.util.Scanner;


public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce tu calificación: ");
		
		Scanner teclado = new Scanner (System.in);
		
		int nota = teclado.nextInt();
		
		if (nota < 5) {
			
			System.out.println("Insuficiente.");
			
		}else if (nota < 6) {
			
			System.out.println("Suficente.");
			
		}else if (nota < 7) {
			
			System.out.println("Bien.");
			
		}else if (nota < 9) {
			
			System.out.println("Notable.");
			
		}else {
			
			System.out.println("Sobresaliente.");
		}

	}

}
