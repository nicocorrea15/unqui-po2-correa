package po2.tp3;

public class Punto {
	
	private int x = 0; 
	private int y = 0;
	
	public Punto(int x, int y) {
		this.x = x; 
		this.y = y; 
	}
	
	public int getX() {
		return x; 
	}

	public int getY() {
		return y; 
	}
	
	public void setX(int num) {
		
	     x += num;
	}
	
	public void setY(int num) {
		
	     y += num;
	}

}
