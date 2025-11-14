package Ej_Final_NavaVinted;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaProductos implements Serializable {
	
	protected List<Producto> productos =new ArrayList<>();

	public ListaProductos(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	public ListaProductos() {
		super();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "listaProductos [productos=" + productos + "]";
	}
	
	public void mostrarProductos() {
		
		for (Producto p : productos) {
			
			System.out.println(p);
		}
	}
	
	public void annadirProducto(Producto p) {
		
		productos.add(p);
	}

}
