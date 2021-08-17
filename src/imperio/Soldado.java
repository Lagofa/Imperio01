package imperio;


public class Soldado extends Unidad {
	private static final int DANIO = 20;
	private static final double RANGO_MAXIMO = 1.5;
	private static final int CANTIDAD_ATAQUES = 2;
	private int ataquesRealizados;

	public Soldado(Posicion posicion) {
		super(posicion);
		this.descansar();
	}

	@Override
	public void atacar(Unidad otraUnidad) {
		double distancia = this.posicion.distanciaCon(otraUnidad.posicion);
		if (distancia < RANGO_MAXIMO && this.ataquesRealizados < CANTIDAD_ATAQUES) {
			otraUnidad.recibirDanio(DANIO);
			this.ataquesRealizados++;
		}
	}

	public void descansar() {
		this.ataquesRealizados = 0;
	}

}
