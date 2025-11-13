package Tema1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos el stream de lectura
		BufferedReader fichero = null;
		
		//Si el fichero no existe se lanza una excepción que hay que capturar
		try{
			//Abrimos el fichero
			fichero = new BufferedReader(new FileReader("/home/diurno/Escritorio/Aviso"));
			
			//Variable para ir leyendo los caracteres del fichero
			String linea;
			
			//Bucledelecturadelfichero
			System.out.println("Contenido del fichero :");
			
			while((linea=fichero.readLine())!=null){
				
				System.out.println(linea);
			}
			
		}catch(Exception e){
			
			System.out.println("Error al abrir el fichero");
			e.getMessage();
			e.printStackTrace();
		}
		finally {
			
			try {
				
				fichero.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
