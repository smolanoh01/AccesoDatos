package Objetos;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Ej38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, Alumno> mapa = new LinkedHashMap<Integer, Alumno>();
		
		mapa.put(1, new Alumno(1,"Sergio","Molano"));
		
		mapa.put(2, new Alumno(2,"Juan","Beato"));
		
		mapa.put(3, new Alumno(3,"Ana","Martin"));
		
		for (Entry<Integer, Alumno> entry : mapa.entrySet()) {
			Integer key = entry.getKey();
			Alumno val = entry.getValue();
			
			System.out.println(key + ", "+val);
		}
		

	}

}
