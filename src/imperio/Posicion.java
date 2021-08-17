package imperio;

public class Posicion implements Desplazable {
	private double posicionX;
	private double posicionY;

	public Posicion(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.posicionX += deltaX;
		this.posicionY += deltaY;
	}

	public double distanciaCon(Posicion otraPosicion) {
		return Math.sqrt(Math.pow(this.posicionX - otraPosicion.posicionX, 2)
				+ Math.pow(this.posicionY - otraPosicion.posicionY, 2));
	}
	
}
