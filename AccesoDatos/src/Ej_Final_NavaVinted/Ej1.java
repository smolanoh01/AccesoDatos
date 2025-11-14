package Ej_Final_NavaVinted;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaProductos listaP = new ListaProductos();
		
		try {
			BufferedReader fichero = new BufferedReader(new FileReader("ropa.csv"));
			
			String linea;
			
			while ((linea=fichero.readLine())!=null) {
				
				String[] textoSeparado = linea.split(";");
				Producto p = new Producto();
				p.setId(Integer.parseInt(textoSeparado[0])); 		//ID
				p.setNombre(textoSeparado[1]); 						//Nombre
				//p.setCategoria(textoSeparado[2]); 				//Categoria
				p.setTalla(textoSeparado[3]);;						//Talla
				p.setColor(textoSeparado[4]);						//Color
				//p.setMaterial(textoSeparado[5]); 					//Material
				p.setStock(Integer.parseInt(textoSeparado[6]));		//Stock
				p.setPrecio(Double.parseDouble(textoSeparado[7]));	//Precio
				p.setCoste(Double.parseDouble(textoSeparado[8]));	//Coste
				p.setEstado(textoSeparado[9]);						//Estado
				p.setDescuento(Integer.parseInt(textoSeparado[0])); //Descuento
				
			
				listaP.annadirProducto(p);
			}
			
			listaP.mostrarProductos();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ropa.dat"));
			
			oos.writeObject(listaP);
			oos.close();
			System.out.println("Lista de personas añadida.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
