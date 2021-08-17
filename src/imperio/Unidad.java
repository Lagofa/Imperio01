package imperio;



public abstract class Unidad {
	protected Posicion posicion;
	protected int salud;
	private static final int SALUD_INICIAL = 100;

	public int getSalud() {
		return this.salud;
	}

	public Unidad(Posicion posicion) {
		this.posicion = posicion;
		this.salud = SALUD_INICIAL;
	}

	public double distanciaCon(Unidad otraUnidad) {
		return this.posicion.distanciaCon(otraUnidad.posicion);
	}

	protected abstract void atacar(Unidad c);
	
	protected void recibirDanio(int danio) {
		this.salud -= danio;
	}
}
