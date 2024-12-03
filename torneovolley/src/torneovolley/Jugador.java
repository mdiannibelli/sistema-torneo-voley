package torneovolley;

import java.util.UUID;

import torneovolley.enums.TIpoJugador;

public class Jugador {
	protected UUID id;
	public String nombre;
	public int numero;
	protected Equipo equipo;
	protected TIpoJugador tipoJugador;
	protected boolean estaActivo;
	protected Estadisticas estadisticas;
	
	public Jugador(String nombre, int numero, Estadisticas estadisticas) {
		this.id = UUID.randomUUID();
		this.nombre = nombre;
		this.numero = numero;
		this.equipo = null;
		this.tipoJugador = TIpoJugador.TITULAR;
		this.estaActivo = true;
		this.estadisticas = estadisticas;
	}
	
	public Jugador(String nombre, int numero) {
		this.id = UUID.randomUUID();
		this.nombre = nombre;
		this.numero = numero;
		this.equipo = null;
		this.tipoJugador = TIpoJugador.TITULAR;
		this.estaActivo = true;
		this.estadisticas = new Estadisticas(this);
	}

	public String getNombre() {
		return nombre;
	}
	
	public TIpoJugador getTipoJugador() {
		return this.tipoJugador;
	}
	
	public void changeTipoJugador() {
		if(this.tipoJugador == TIpoJugador.TITULAR) {
			this.tipoJugador = TIpoJugador.SUPLENTE;
		} else {
			this.tipoJugador = TIpoJugador.TITULAR;
		}
	}
	
	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	
	
	
}
