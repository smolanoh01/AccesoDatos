package Excepciones;

import java.util.*;

public class Ej_Excepciones {
    public static void main(String[] args) {

        // 1. Conversión inválida de String a int
        try {
        	String invalido = "abc";
            int numero = Integer.parseInt(invalido); 
            
		} catch (NumberFormatException e) {
			
			System.out.println("El valor introducido no cumple con el formato.");
		}

        // 2. División por cero
        try {
        	int resultado = 10 / 0; 
        	
		} catch (ArithmeticException e) {
			
			System.out.println("Error, división por cero.");
		}

        // 3. Operación sobre variable null
       try {
    	   String texto = null;
           int longitud = texto.length(); 
           
       } catch (NullPointerException e) {
		
		System.out.println("Este texto no tiene longitud.");
       }

        // 4. Acceso a índice inválido en lista
        try {
        	List<String> lista = new ArrayList<>();
            lista.add("A");
            String valor = lista.get(2); 
            
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No hay valor asignado al índice.");
		}

        // 5. Modificación de colección durante iteración
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Jose");
        nombres.add("Leo");

        try {
        	for (String nombre : nombres) {
                if (nombre.equals("Ana")) {
                    nombres.remove(nombre); 
                }
            }
		} catch (ConcurrentModificationException e) {
				System.out.println("Error en la modificación");		}
    }
}