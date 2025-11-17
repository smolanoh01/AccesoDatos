package Ej_Final_Contactos_Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Instanciar un contexto de la clase JAXBContext con la clase RootElement
			JAXBContext contexto = JAXBContext.newInstance(ListaPersonas.class);

			// Crear un unmarshaller que convierte el XML en JavaBeans.
			Unmarshaller um = contexto.createUnmarshaller();

			// Realizar la deserialización llamando al método unmarshal del marshaller.
			ListaPersonas listaP = (ListaPersonas) um.unmarshal(new File("personas.xml"));
			
			//Mostrar lista (comprobación)
			listaP.mostrarPersonas();
			
			//Guardamos la lista en un fichero binario
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas2.obj", true));
			oos.writeObject(listaP);
			oos.close();

			System.out.println("Lista almacenada correctamente.");

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
