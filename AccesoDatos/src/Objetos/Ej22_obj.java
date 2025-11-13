package Objetos;

public class Ej22_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona personas[] = new Persona[5];
		
		personas[0]= new Persona("Sergio", "Molano", "88888888a", 22, false);
		
		personas[1] = new Persona("Manuel", "Garcia", "11111111b", 18, false);

		personas[2] = new Persona("Mario", "Garcia", "11111111b", 28, false);
		
		personas[3] = new Persona("Juan", "Martin", "11111111b", 38, true);
		
		personas[4] = new Persona("Pedro", "Perez", "11111111b", 38, true);
		
		for (Persona p : personas) {
			
			System.out.println(p.toString());
		}

	}

}
