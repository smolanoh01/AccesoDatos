package Ej_Final_NavaVinted;

import java.io.Serializable;

public class Producto implements Serializable {

	private int Id, stock, descuento;
	private String nombre, talla, color, estado;
	private double precio, coste;

	public Producto(int id, String nombre, String talla, String color, int stock, double precio, double coste,
			String estado, int descuento) {
		super();
		Id = id;
		this.stock = stock;
		this.descuento = descuento;
		this.nombre = nombre;

		this.talla = talla;
		this.color = color;
		this.estado = estado;
		this.precio = precio;
		this.coste = coste;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", stock=" + stock + ", descuento=" + descuento + ", nombre=" + nombre
				+ ", talla=" + talla + ", color=" + color + ", estado=" + estado + ", precio=" + precio + ", coste="
				+ coste + "]";
	}

	public Producto() {
		super();
	}

}
