package JAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement
public class Libreria {

	ArrayList<Libro> listaLibro = new ArrayList<Libro>();
	private String nombre, lugar;
	private int cp;

	public Libreria() {
		super();
	}
	
	@XmlElementWrapper(name = "listaLibro")
	@XmlElement(name = "Libro")
	public ArrayList<Libro> getlistaLibro() {
		return listaLibro;
	}

	public void setlistaLibro(ArrayList<Libro> listaLibro) {
		listaLibro = listaLibro;
	}
	
	public void aniadirLibro(Libro l){
		this.listaLibro.add(l);
	}

	@XmlAttribute
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlAttribute
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@XmlAttribute
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
	

}
