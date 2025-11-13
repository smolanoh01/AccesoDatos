package Ej_Final_Contactos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear objeto ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		
		//Leer fichero JSON y convertirlo en una lista de personas
		
		try {
			Personas persona = mapper.readValue(new File("EjFinal_Contactos.json"), Personas.class);
			
			persona.mostrarPersonas();
			
			ArrayList<Persona> listaPersonas = new ArrayList<>(persona.getPersonas());
			
			//Guardado en fichero binario
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas1.obj"));
			
			oos.writeObject(listaPersonas);
			oos.close();
			
			System.out.println("Lista de personas añadida.");
			
			
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
