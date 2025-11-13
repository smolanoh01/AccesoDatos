package Bucles;

import java.util.Scanner;

import java.util.Random;

public class Ej20 {
	
	public static int generarAleatorio() {
		
		Random aleatorio = new Random();
		
		int n = aleatorio.nextInt(100) + 1;
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean adivinado = false;
		
		Scanner teclado = new Scanner (System.in);
		
		int numero = generarAleatorio();
		
		int entrada=0;
		
		System.out.println(numero);
		
		
		do {
			
			do {
				
				try {
					System.out.println("Introduce un número del 1 al 100: ");
					
					entrada = teclado.nextInt();
					
				} catch (Exception e) {
					System.out.println("Error al leer el teclado.\n");
					teclado.next();
				}
				
			} while (entrada < 1 || entrada > 100);
			
			if (numero > entrada) {
				
				System.out.println("El número es mayor.\n");
				
			}else if(numero < entrada){
				
				System.out.println("El número es menor.\n");
				
			}else {
				
				adivinado = true;
				
				System.out.println("Enhorabuena, has acertado!!!");
				
			}
			
		} while (adivinado == false);

	}

}
