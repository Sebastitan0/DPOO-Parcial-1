package logica;

public class Peon extends Pieza{

	public Peon(double fila, double columna ) {
		super(fila, columna);
	}

	@Override
	public double movimiento() throws Exception{
		double movimientos = 1;
		if(this.fila <2) {
			throw new Exception("el peon no puede estár en esa fila");
		}
		if(this.fila < 1 || this.fila >8 || this.columna < 1 || this.columna >8) {
			throw new Exception("Casillas invalidas");
		}
		else if(this.fila == 2) {
			return movimientos = 2;
		}
		else if(this.fila == 8) {
			return movimientos = 0;
		}
		else {
			return movimientos;
		}
	}

}
