package Ej_Final_Contactos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> listaP1 = new ArrayList<Persona>();
		ArrayList<Persona> listaP2 = new ArrayList<Persona>();
		
		ArrayList<Persona> listaFinal = new ArrayList<Persona>();
		
		try {
			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("personas1.obj"));
			
			listaP1 = (ArrayList<Persona>) ois1.readObject();
			
			ois1.close();
			
			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("personas2.obj"));
			
			listaP2 = (ArrayList<Persona>) ois2.readObject();
			
			ois2.close();
			
			for (Persona p1 : listaP1) {
				
				for (Persona p2 : listaP2) {
					
					if (p1.getDni().equals(p2.getDni())) {
						
						p2.setNombre(p1.getNombre());
						
						p2.setEdad(p2.getEdad());
						
						listaFinal.add(p2);
					}
					
				}
			}
			
			for (Persona p : listaFinal) {
				System.out.println(p.toString());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
