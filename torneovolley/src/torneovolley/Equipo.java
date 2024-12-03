package torneovolley;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Equipo {
	protected UUID id;
	protected String nombre;
	protected List<Jugador> jugadores;
	protected int partidosGanados;
	protected int partidosPerdidos;
	protected int partidosJugados;
	protected int partidosEmpatados;
	
	public Equipo(String nombre) {
		this.id = UUID.randomUUID();
		this.nombre = nombre; 
		this.jugadores = new ArrayList<>();
		this.partidosGanados = 0;
		this.partidosPerdidos = 0;
		this.partidosJugados = 0;
		this.partidosEmpatados = 0;
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Jugador> getJugadores() {
	    return jugadores;
	}
	
	public void agregarJugador(Jugador jugador) {
		if(this.jugadores.contains(jugador)) {
			System.out.println("El jugador ya existe en el equipo");
			return;
		}
		if(jugador.getEquipo() != null) {
			System.out.println("El jugador ya se encuentar en un equipo!");
			return;
		}
		
		this.jugadores.add(jugador);
		jugador.setEquipo(this);
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Equipo: " + this.nombre);
		System.out.println("Partidos jugados: " + this.partidosJugados);
		System.out.println("Partidos ganados: " + this.partidosGanados);
		System.out.println("Partidos perdidos: " + this.partidosPerdidos);
		System.out.println("Partidos empatados: " + this.partidosEmpatados);
		System.out.println("Cantidad de jugadores: " + this.jugadores.size());
	}
}
