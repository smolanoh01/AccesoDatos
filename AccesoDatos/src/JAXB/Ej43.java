package JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Ej43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cargar fichero XML
		try {
			//Instanciar un contexto de la clase JAXBContext con la clase RootElement
			 JAXBContext contexto = JAXBContext.newInstance(Libreria.class);
			 
			 //Crear un unmarshaller que convierte el XML en JavaBeans.
			 Unmarshaller um = contexto.createUnmarshaller();
			 
			 //Realizar la deserialización llamando al método unmarshal del marshaller.
			 Libreria miLibreria = (Libreria) um.unmarshal(new File("libreria.xml"));
			 
			 //Mostrar Datos 
			 System.out.println("Libreria "+ miLibreria.getNombre());
			 System.out.println("Población "+ miLibreria.getLugar()+" "+miLibreria.getCp());
			 System.out.println("Libros disponibles: ");
			 
			 for (Libro l : miLibreria.getlistaLibro()) {
				
				 System.out.println("Titulo: " + l.getTitulo() + "\tAutor: " + l.getAutor() + "\tEditorial: " + l.getEditorial() + "\tISBN: " + l.getIsbn());
			}
			 
			 //miColeccion.mostrarColeccion();
			} catch (JAXBException e) {
			 e.printStackTrace();
			 }

	}

}
