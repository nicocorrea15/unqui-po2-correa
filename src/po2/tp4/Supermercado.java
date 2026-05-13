package po2.tp4;

import java.util.*;

public class Supermercado {
	
	ArrayList<Producto> catalogo;
	String direccion;
	
	public Supermercado(ArrayList<Producto> catalogo, String direccion) {
		this.catalogo = catalogo;
		this.direccion = direccion;
	}

	public void addProducto(Producto producto) {
		catalogo.add(producto);
		
	}
	
	public int cantProductos() {
		
		return catalogo.size();
	}
	
	public double totalPrecioProductos() {
	    
		return catalogo.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
}
