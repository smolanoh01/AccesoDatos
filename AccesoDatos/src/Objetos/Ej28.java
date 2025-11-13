package Objetos;

import java.util.Scanner;

public class Ej28 {
	
	public static void inicializarVehiculo(Vehiculo v) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca la matrícula del vehículo: ");
		
		v.setMatricula(teclado.nextLine());
		
		System.out.println("Introduzca la marca del vehículo: ");
		
		v.setMarca(teclado.nextLine());
		
		System.out.println("Introduzca el precio de compra del vehículo: ");
		
		v.setPrecioCompra(Double.parseDouble(teclado.nextLine()));
	}
	
	public static void mostrarDatos(Vehiculo v) {
		
		System.out.println("Matricula: "+v.getMatricula()+" | Marca: " + v.getMarca() + " | Precio: " + v.getPrecioCompra());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo coche1 = new Vehiculo("2233ABC","Audi",19000);
		
		Vehiculo moto1 = new Vehiculo();
		
		inicializarVehiculo(moto1);
		
		System.out.println(moto1.toString());
		
		mostrarDatos(coche1);
		
		System.out.println("Precio final coche1 = "+coche1.pvp(50));
		
		System.out.println("Precio final moto1 = "+moto1.pvp(20));

	}

}
