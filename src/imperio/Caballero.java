package imperio;


public class Caballero extends Unidad {
	private static final int DANIO = 30;
	private static final int RANGO_MINIMO = 1;
	private static final int RANGO_MAXIMO = 3;
	private static final int ATAQUES_ASUSTADO=2;
	private int ataquesRealizados;

	public Caballero(Posicion posicion) {
		super(posicion);
	}

	@Override
	public void atacar(Unidad otraUnidad) {
		double distancia = this.posicion.distanciaCon(otraUnidad.posicion);
		if (distancia >= RANGO_MINIMO && distancia <= RANGO_MAXIMO) {
			otraUnidad.recibirDanio(DANIO);
			this.ataquesRealizados++;
		}
		if(this.ataquesRealizados<ATAQUES_ASUSTADO) {
			this.ataquesRealizados=0;
			this.posicion.desplazar(1, 1);
		}		
	}


}
