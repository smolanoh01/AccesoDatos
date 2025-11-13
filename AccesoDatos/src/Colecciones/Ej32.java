package Colecciones;

import java.util.LinkedHashSet;

public class Ej32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> lista = new LinkedHashSet<String>();
		
		lista.add("ESO");
		lista.add("GM-SMR");
		lista.add("GS-DAM");
		lista.add("GS-ASIR");
		lista.add("BACH");
		
		for (String s : lista) {
			
			System.out.println(s);
			
		}

	}

}
