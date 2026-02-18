package logica;

public abstract class Pieza {
	protected double fila;
	protected double columna;
	public Pieza(double fila, double columna) {
		this.fila = fila;
		this.columna = columna;

	}
	public abstract double movimiento() throws Exception;
	
	
		
	}

