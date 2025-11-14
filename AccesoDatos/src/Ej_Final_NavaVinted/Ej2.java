package Ej_Final_NavaVinted;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaProductos listaP = new ListaProductos();

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ropa.dat"));

			listaP = (ListaProductos) ois.readObject();

			// Crear o abrir un archivo para escribir
			RandomAccessFile precio = new RandomAccessFile("precio.dat", "rw");

			for (Producto p : listaP.getProductos()) {

				precio.writeInt(p.getId());
				precio.writeDouble(p.getPrecio());
				precio.writeDouble(p.getCoste());
				precio.writeInt(p.getDescuento());

			}
			
			System.out.println("Fichero escrito.");

		} catch (EOFException eof) {
			// TODO: handle exception

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
