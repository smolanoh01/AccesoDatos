package JAXB;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Ej42 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear Libreria
		Libreria libreria = new Libreria();

		// Pedir datos de libreria
		System.out.println("Introduce el nombre de la libreria: ");
		libreria.setNombre(teclado.nextLine());
		System.out.println("Introduce el lugar donde se encuentra la libreria: ");
		libreria.setLugar(teclado.nextLine());
		System.out.println("Introduce el codigo postal: ");
		libreria.setCp(Integer.parseInt(teclado.nextLine()));

		// Pedir datos de los libros
		boolean salir = false;
		
		while (salir == false) {

			System.out.println("Escriba 1 si desea añadir libro / Escriba 2 si desea salir: ");
			int valor = Integer.parseInt(teclado.nextLine());

			if (valor == 2) {

				System.out.println("Saliendo...\n");
				salir = true;

			} else {

				Libro l = new Libro();
				System.out.println("Introduce el titulo del libro: ");
				l.setTitulo(teclado.nextLine());
				System.out.println("Introduce el autor del libro: ");
				l.setAutor(teclado.nextLine());
				System.out.println("Introduce la editorial del libro: ");
				l.setEditorial(teclado.nextLine());
				System.out.println("Introduce el isbn del libro: ");
				l.setIsbn(Integer.parseInt(teclado.nextLine()));
				
				libreria.aniadirLibro(l);
			}

		}
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		
		try {
			// Crear contexto JAXB
			JAXBContext jaxbContext = JAXBContext.newInstance(Libreria.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			// Configuración opcional para formato legible
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			// Convertir objeto a XML y mostrar en consola
			marshaller.marshal(libreria, System.out);
			
			//
			marshaller.marshal(libreria, new File("libreria.xml"));
			
			} catch (JAXBException e) {
			e.printStackTrace();
			}

	}
}
