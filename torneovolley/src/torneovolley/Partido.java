package torneovolley;

import java.util.UUID;

public class Partido {
	protected UUID id;
	protected Equipo equipo1;
	protected Equipo equipo2;
	protected int puntajeEquipo1;
	protected int puntajeEquipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2) {
		this.id = UUID.randomUUID();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.puntajeEquipo1 = 0;
		this.puntajeEquipo2 = 0;
	}
	
	public Equipo obtenerGanador() {
		while(true) {
			if(Math.random() < 0.5) {
				puntajeEquipo1++;
			} else {
				puntajeEquipo2++;
			}
			
			// Equipo con puntuación 21 o diferencia de 2
			if((puntajeEquipo1 >= 21 || puntajeEquipo2 >= 21) && Math.abs(puntajeEquipo1 - puntajeEquipo2) >= 2) {
				break;
			}
		}
		
		if(puntajeEquipo1 > puntajeEquipo2) {
			System.out.println("El ganador es el equipo " + equipo1.getNombre() + " con " + this.puntajeEquipo1 + " puntos!");
			return equipo1;
		} else {
			System.out.println("El ganador es el equipo " + equipo2.getNombre() + " con " + this.puntajeEquipo2 + " puntos!");
			return equipo2;
		}
	}
}