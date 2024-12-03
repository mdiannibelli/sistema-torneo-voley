package torneovolley;

public class Main {

	public static void main(String[] args) {
		Torneo torneo = new Torneo("Nuevo Torneo");
		Equipo equipo1 = new Equipo("Equipo 1");
		equipo1.agregarJugador(new Jugador("Perez", 1));
		equipo1.agregarJugador(new Jugador("Tommy", 2));
		equipo1.agregarJugador(new Jugador("Jhonny", 3));
		
		equipo1.getJugadores().get(0).changeTipoJugador(); // Pasar de titular a suplente o viceversa
		
		Equipo equipo2 = new Equipo("Equipo 2");
		equipo2.agregarJugador(new Jugador("Mobby", 1));
		equipo2.agregarJugador(new Jugador("Sun", 2));
		equipo2.agregarJugador(new Jugador("Port", 3));
		
		equipo2.getJugadores().get(0).changeTipoJugador();
		
		Equipo equipo3 = new Equipo("Equipo 3");
		equipo3.agregarJugador(new Jugador("Klan", 1));
		equipo3.agregarJugador(new Jugador("Jhon", 2));
		equipo3.agregarJugador(new Jugador("Martin", 3));
		
		equipo3.getJugadores().get(0).changeTipoJugador();
		
		Equipo equipo4 = new Equipo("Equipo 4");
		equipo4.agregarJugador(new Jugador("Robert", 1));
		equipo4.agregarJugador(new Jugador("Jimmy", 2));
		equipo4.agregarJugador(new Jugador("Paez", 3));
		
		equipo4.getJugadores().get(0).changeTipoJugador();
		
		Equipo equipo5 = new Equipo("Equipo 5");
		equipo5.agregarJugador(new Jugador("Leandro", 1));
		equipo5.agregarJugador(new Jugador("Valentin", 2));
		equipo5.agregarJugador(new Jugador("Pablo", 3));
		
		equipo5.getJugadores().get(0).changeTipoJugador();
		
		Equipo equipo6 = new Equipo("Equipo 6");
		equipo6.agregarJugador(new Jugador("Jihn", 1));
		equipo6.agregarJugador(new Jugador("Mateo", 2));
		equipo6.agregarJugador(new Jugador("Tobias", 3));
		
		equipo6.getJugadores().get(0).changeTipoJugador();
		
		Equipo equipo7 = new Equipo("Equipo 7");
		equipo7.agregarJugador(new Jugador("Pedro", 1));
		equipo7.agregarJugador(new Jugador("Guillermo", 2));
		equipo7.agregarJugador(new Jugador("Martinez", 3));
		
		equipo7.getJugadores().get(0).changeTipoJugador();
		
		Equipo equipo8 = new Equipo("Equipo 8");
		equipo8.agregarJugador(new Jugador("Gustavo", 1));
		equipo8.agregarJugador(new Jugador("Marcos", 2));
		equipo8.agregarJugador(new Jugador("Marco", 3));
		
		equipo8.getJugadores().get(0).changeTipoJugador();
		
		
		torneo.registrarEquipo(equipo1);
		torneo.registrarEquipo(equipo2);
		torneo.registrarEquipo(equipo3);
		torneo.registrarEquipo(equipo4);
		torneo.registrarEquipo(equipo5);
		torneo.registrarEquipo(equipo6);
		torneo.registrarEquipo(equipo7);
		torneo.registrarEquipo(equipo8);
		
		//equipo1.mostrarEstadisticas();
		
		torneo.iniciarTorneo();

	}

}
