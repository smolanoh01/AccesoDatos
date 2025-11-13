package Colecciones;

import java.util.TreeSet;

public class Ej33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> conjunto = new TreeSet<String>();
		
		conjunto.add("1ESOA");
		conjunto.add("4ESOC");
		conjunto.add("2DAM");
		conjunto.add("1FPB");
		conjunto.add("2BACHB");
		
		for (String s : conjunto) {
			
			System.out.println(s);
			
		}

	}

}
