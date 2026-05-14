package po2.tp5;

public class ProductoCooperativo extends Producto{

	public ProductoCooperativo(double precioBase, String nombre, int stock) {
		super(precioBase, nombre, stock);
	}

	@Override
	public double getPrecio() {
		 return super.getPrecio() * 0.9; 
	}

}
