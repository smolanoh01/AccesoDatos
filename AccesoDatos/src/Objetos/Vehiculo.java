package Objetos;

public class Vehiculo {
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula, String marca, double precioCompra) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.precioCompra = precioCompra;
	}
	private String matricula,marca;
	private double precioCompra;
	
	public double pvp(int beneficio) {
		
		return this.precioCompra + ((this.precioCompra*beneficio)/100);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", precioCompra=" + precioCompra + "]";
	}

}
