package po2.tp8;

public class Soja implements Cultivo {
	
	private double ganancia = 500;
	
	public Soja() {}
	
	@Override
	public double getGanancia() {
		return ganancia;
	}

}