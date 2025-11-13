package Bucles;

public class Ej22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[]= new int[5];
		
		for (int i = 0; i < v.length; i++) {
			
			v[i]=i;
			System.out.println(v[i]);
		}
		
		System.out.println();
		
		for (int n : v) {
			
			System.out.println(n);
		}

	}

}
