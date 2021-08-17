package imperio;


public class Arquero extends Unidad {
	private static final int DANIO = 7;
	private static final int RANGO_MINIMO = 5;
	private static final int RANGO_MAXIMO = 25;
	private int flechas;
	
	private static final int CANTIDAD_FLECHAS = 12;

	public Arquero(Posicion posicion) {
		super(posicion);
		this.recargar();
	}

	@Override
	public void atacar(Unidad otraUnidad) {
		double distancia = this.posicion.distanciaCon(otraUnidad.posicion);
		if (distancia >= RANGO_MINIMO && distancia <= RANGO_MAXIMO && this.flechas > 0) {
			otraUnidad.recibirDanio(DANIO);
			this.flechas--;
		}
	}

	public void recargar() {
		this.flechas = CANTIDAD_FLECHAS;
	}

}
