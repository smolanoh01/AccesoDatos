package Colecciones;

import java.util.HashSet;

public class Ej31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> conjunto = new HashSet<String>();
		
		conjunto.add("Sergio");
		conjunto.add("Sergio");
		conjunto.add("Manuel");
		conjunto.add("Victor");
		conjunto.add("Juan");
		conjunto.add("Rafa");
		
		for (String s : conjunto) {
			
			System.out.println(s);
			
		}

	}

}
