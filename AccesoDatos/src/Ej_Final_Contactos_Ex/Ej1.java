package Ej_Final_Contactos_Ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un objeto Mapper
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Leer fichero json y convertirlo a un objeto tipo ListaPersonas
			ListaPersonas listaP = mapper.readValue(new File("EjFinal_Contactos.json"), ListaPersonas.class);

			// Imprimir el objeto personas (comprobación)
			listaP.mostrarPersonas();

			// Guardamos la lista en un fichero binario
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas1.obj", true));
			oos.writeObject(listaP);
			oos.close();

			System.out.println("Lista almacenada correctamente.");

		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
