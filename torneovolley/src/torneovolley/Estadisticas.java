package torneovolley;

public class Estadisticas {
	public Jugador jugador;
	public int aces;
	public int bloqueos;
	public int ataques;
	
	public Estadisticas(Jugador jugador, int aces, int bloqueos, int ataques) {
		this.jugador = jugador;
		this.aces = aces;
		this.bloqueos = bloqueos;
		this.ataques = ataques;
	}
	
	public Estadisticas(Jugador jugador) {
		this.jugador = jugador;
		this.aces = 0;
		this.bloqueos = 0;
		this.ataques = 0;
	}
	
	public void incrementarAces(int cantidad) {
		this.aces += cantidad;
	}
	
	public void incrementarBloqueos(int cantidad) {
		this.bloqueos += cantidad;
	}
	
	public void incrementarAtaques(int cantidad) {
		this.ataques += cantidad;
	}
	
}
