package po2.tp8;

import java.util.*;

public class PorcionMixta implements Cultivo {

    private ArrayList<Cultivo> regiones;

    public PorcionMixta(Cultivo r1, Cultivo r2, Cultivo r3, Cultivo r4) {
    		
    	this.regiones = new ArrayList<Cultivo>();
			
    		regiones.add(r1);
			regiones.add(r2);
			regiones.add(r3);
			regiones.add(r4);
}
    
    @Override
    public double getGanancia() {
        double total = 0;

        for (Cultivo c : regiones) {
            total += c.getGanancia() / 4;
        }

        return total;
    }
}