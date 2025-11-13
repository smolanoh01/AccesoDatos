package Ej_Final_Contactos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// Instanciar un contexto de la clase JAXBContext con la clase RootElement
			JAXBContext contexto;
			contexto = JAXBContext.newInstance(Personas.class);

			// Crear un unmarshaller que convierte el XML en JavaBeans.
			Unmarshaller um = contexto.createUnmarshaller();

			// Realizar la deserialización llamando al método unmarshal del marshaller.
			Personas listaP = (Personas) um.unmarshal(new File("personas.xml"));
			
			ArrayList<Persona> pers = new ArrayList<Persona>();
			
			pers = listaP.getPersonas();

			// Guardar en fichero binario
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas2.obj"));

			oos.writeObject(pers);
			oos.close();

			listaP.mostrarPersonas();

		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
