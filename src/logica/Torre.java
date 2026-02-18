package logica;

public class Torre extends Pieza {

	public Torre(double fila, double columna) {
		super(fila, columna);
	}

	@Override
	public double movimiento() throws Exception {
		double movimientos = 4;
		if(this.fila < 1 || this.fila >8 || this.columna < 1 || this.columna >8) {
			throw new Exception("Casillas invalidas");
		}
		if (this.fila == 1 && this.columna == 1 || this.fila == 1 && this.columna == 8
				|| this.fila == 8 && this.columna == 1 || this.fila == 8 && this.columna == 8) {
			return movimientos = 2;
		}else {
			return movimientos;
		}
			
		
	}
	
}
