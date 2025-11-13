package Ej_Final_Contactos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "dni", "telefono" , "email"})
public class Persona implements Serializable {
	
	private String dni;
	private String nombre, email,telefono;
	private int edad;


	public Persona(String dni, String email, String telefono) {
		super();
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
	}

	public Persona() {
		super();
	}
	
	@XmlElement(name="dni")
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@XmlTransient
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlTransient
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@XmlElement(name="telefono")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	

}
