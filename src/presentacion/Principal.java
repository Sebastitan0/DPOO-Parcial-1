package presentacion;

import logica.Peon;
import logica.Pieza;
import logica.Alfil;
import logica.Torre;

public class Principal {

	public Principal() {
		Pieza[] piezas = new Pieza[3];
		
		piezas[0] = new Peon(1, 4);
		piezas[1] = new Alfil(2, 8);
		piezas[2] = new Torre(1, 1);
		
		for (Pieza p: piezas) {
			try {
				System.out.println(p.movimiento());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new Principal ();
	}

}
