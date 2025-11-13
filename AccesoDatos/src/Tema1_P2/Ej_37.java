package Tema1_P2;

import java.io.File;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ej_37 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws TransformerFactoryConfigurationError, TransformerException {

		try {
			// Crear estructura para almacenar Alumnos
			TreeSet<Alumno> alumnos = new TreeSet<>(Comparator.comparingInt(Alumno::getNumExpediente));

			// Pedir y almacenar datos de alumnos
			boolean salir = false;
			int numAlumnos = 0;

			while (salir == false) {

				System.out.println("Escriba 1 si desea añadir alumno / Escriba 2 si desea salir: ");
				int valor = Integer.parseInt(teclado.nextLine());

				if (valor == 2) {

					System.out.println("Saliendo...\n");
					salir = true;

				} else {

					Alumno al = new Alumno();

					System.out.println("Introduzca el número de expediente del alumno: ");
					al.setNumExpediente(Integer.parseInt(teclado.nextLine()));
					System.out.println("Introduzca el nombre del alumno: ");
					al.setNombreAlumno(teclado.nextLine());
					System.out.println("Introduzca la nota del alumno: ");
					al.setNota(Double.parseDouble(teclado.nextLine()));

					alumnos.add(al);
					System.out.println("Alumno añadido correctamente.\n");
					numAlumnos++;

				}
			}

			// Creamos la factoría
			DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();

			// Creamos el DocumentBuilder
			DocumentBuilder db = factoria.newDocumentBuilder();

			// Creamos un DOM vacío
			Document documento = db.newDocument();

			// Establecemos la versión
			documento.setXmlVersion("1.0");

			// Creamos elementos y añadimos al DOM
			Element raiz = documento.createElement("alumnos");

			// Añadimos elemento raíz al documento
			documento.appendChild(raiz);

			// Bucle para añadir el número de hijos que introdujo el usuario

			for (Alumno al : alumnos) {

				Element elementoAlumno = documento.createElement("alumno");
				raiz.appendChild(elementoAlumno);

				Element elementoExp = documento.createElement("numExpediente");
				elementoAlumno.appendChild(elementoExp);
				elementoExp.appendChild(documento.createTextNode(String.valueOf(al.getNumExpediente())));

				Element elementoNombre = documento.createElement("nombreAlumno");
				elementoAlumno.appendChild(elementoNombre);
				elementoNombre.appendChild(documento.createTextNode(al.getNombreAlumno()));

				Element elementoNota = documento.createElement("nota");
				elementoAlumno.appendChild(elementoNota);
				elementoNota.appendChild(documento.createTextNode(String.valueOf(al.getNota())));

			}

			// 1.Crear una fuente/origen con el árbol DOM
			DOMSource fuente = new DOMSource(documento);

			// 2.Crear el destino de la transformación:
			StreamResult ficheroXML = new StreamResult(new File("notasAlumno.xml"));

			// 2.1.Si queremos mostrar por consola
			StreamResult consola = new StreamResult(System.out);

			// 3.Crear un transformador:
			Transformer t = TransformerFactory.newInstance().newTransformer();

			// 4.Mejoramos el forma
			t.setOutputProperty(OutputKeys.INDENT, "yes");
			t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			// 5.Transformar la fuente en el resultado
			t.transform(fuente, ficheroXML);

			// 5.1. Si queremos mostrar por consola
			t.transform(fuente, consola);
		} catch (ParserConfigurationException e) {
		}
	}

}
