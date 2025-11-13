package Ej_Final_Contactos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Personas implements Serializable {
	
	ArrayList<Persona> personas = new ArrayList<Persona>();

	public Personas() {
		super();
	}
	
	@XmlElement(name = "persona")
	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
	
	public void mostrarPersonas() {
		
		for (Persona p : personas) {
			
			System.out.println(p.toString());
		}
	}

}
