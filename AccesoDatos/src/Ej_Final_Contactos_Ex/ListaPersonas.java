package Ej_Final_Contactos_Ex;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personas")
public class ListaPersonas implements Serializable {
	
	protected List<Persona> personas = new ArrayList<>();

	public ListaPersonas(List<Persona> personas) {
		super();
		this.personas = personas;
	}

	public ListaPersonas() {
		super();
	}
	
	@XmlElement(name = "persona")
	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "ListaPersonas [personas=" + personas + "]";
	}
	
	public void mostrarPersonas() {
		
		for (Persona p : personas) {
			System.out.println(p);
		}
	}
	
	public void annadirPersona(Persona p) {
		
		personas.add(p);
	}

}
