package Objetos;

public class Ej26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Sergio", "Molano", "88888888a", 22, false);
		
		Persona p2 = new Persona("Manuel", "Garcia", "11111111b", 38, false);
		
		if (p1.getEdad() > p2.getEdad()) {
			
			System.out.println(p1.getNombre()+" es mayor.");
			
		}else if(p1.getEdad() < p2.getEdad()) {
			
			System.out.println(p2.getNombre()+" es mayor.");
			
		}else {
			
			System.out.println("Ambas personas tienen la misma edad.");		
		}
		

	}

}
