package torneovolley;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import torneovolley.enums.EstadoTorneo;
import torneovolley.enums.TIpoJugador;

public class Torneo {
	private UUID id;
	public String nombre;
	private Set<Equipo> equipos;
	private List<Partido> partidos;
	public EstadoTorneo estado;
	private Equipo equipoGanador;
	
	public Torneo(String nombre) {
		this.id = UUID.randomUUID();
		this.nombre = nombre;
		this.equipos = new HashSet<>();
		this.partidos = new ArrayList<>();
		this.estado = EstadoTorneo.EN_ESPERA;
		this.equipoGanador = null;
	}
	
	public void registrarEquipo(Equipo equipo) {
		if(this.equipos.contains(equipo)) {
			System.out.println("El equipo ya se encuentra registrado");
			return;
		}
		this.equipos.add(equipo);
	}
	
	public void iniciarTorneo() {
		if(this.equipos.size() < 8) {
			System.out.println("El torneo debe contener 8 equipos");
			return;
		}
		if(this.equipos.size() > 9) {
			System.out.println("El torneo puede iniciar si la cantidad máxima de equipos es de 8");
			return;
		}
		
		if(!this.equipos.stream().allMatch(equipo -> equipo.getJugadores().stream().filter(jugador -> jugador.getTipoJugador() == TIpoJugador.TITULAR).count() == 2)) {
			System.out.println("Los equipos deben tener como máximo 2 jugadores titulares");
			return;
		}
		
		System.out.println("El torneo ha comenzado!");
		this.estado = EstadoTorneo.EN_CURSO;
		
		// Game
		List<Equipo> equiposEnJuego = new ArrayList<>(this.equipos);
		
		while(equiposEnJuego.size() > 1) {
			List<Equipo> ganadores = new ArrayList<>();
			
			for(int i = 0; i < equiposEnJuego.size(); i += 2) {
				Equipo equipo1 = equiposEnJuego.get(i);
				Equipo equipo2 = equiposEnJuego.get(i+1);
				
				Partido partido = new Partido(equipo1, equipo2);
				Equipo ganador = partido.obtenerGanador();
				ganadores.add(ganador);
				
				System.out.println("Ganador del partido entre " + equipo1.getNombre() + " y " + equipo2.getNombre() + ": " + ganador.getNombre());
			}
			
			equiposEnJuego = ganadores;
		}
		this.equipoGanador = equiposEnJuego.get(0);
		this.finalizarTorneo();
		this.mostrarGanador();
	}
	
	public void mostrarGanador() {
		if(this.estado == EstadoTorneo.EN_ESPERA) {
			System.out.println("El torneo todavía no ha empezado");
			return;
		}
		
		if(this.equipoGanador == null || this.estado == EstadoTorneo.EN_CURSO) {
			System.out.println("El torneo no ha finalizado");
			return;
		}
		
		System.out.println("El ganador del torneo " + this.nombre + " es el equipo " + this.equipoGanador.getNombre());
	}
	
	public void finalizarTorneo() {
		if(this.estado != EstadoTorneo.EN_CURSO) {
			System.out.println("El torneo no se encuentra en curso");
			return;
		}
		
		if(this.equipoGanador == null) {
			System.out.println("Para finalizar el torneo debe haber un ganador");
			return;
		}
		
		this.estado = EstadoTorneo.FINALIZADO;
		System.out.println("Se ha finalizado el torneo");
	}
}
