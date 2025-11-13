package Condicionales;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número entero: ");
		
		Scanner teclado = new Scanner (System.in);
		
		int num = teclado.nextInt();
		
		if (num >= 0) {
			
			System.out.println("El número es positivo. ");
			
			if (num%2 == 0) {
				System.out.println("El número "+num+" es par. ");
			}else {
				System.out.println("El número "+num+" es impar. ");
			}
			
		}else {
			System.out.println("El número es negativo.");
		}

	}

}
