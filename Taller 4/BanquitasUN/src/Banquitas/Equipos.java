 	package Banquitas;

import java.util.Scanner;

public class Equipos {
	
	Scanner sc = new Scanner(System.in);
	String nombre;
	int gol = 0;
	Jugadores[] equipo = new Jugadores[5];
	int goles;
	
	public void crearEquipo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre de su equipo...");
		String equi = sc.next();
		System.out.println("Listo!, este es el nombre de tu equipo: "+equi);
		
		
	}
	
public Jugadores[] agregarJugadores(){
		System.out.println("Ingrese los datos de sus jugadores...");
		for(int id=0; id<=5;id++){
			
			System.out.println("Por favor ingrese el nombre del jugador...");
			equipo[id].setNombre(sc.next());
			System.out.println("Por favor ingrese la posicion del jugador...");
			equipo[id].setPosicion(sc.next());
			System.out.println("Por favor ingrese la edad del jugador...");
			equipo[id].setEdad(sc.nextInt());
			System.out.println("Por favor ingrese la dorsal del jugador...");
			equipo[id].setDorsal(id);
			System.out.println("Por favor ingrese la habilidad del jugador...");
			equipo[id].setHabilidad(sc.next());
			equipo[id].setGoles(gol);
			System.out.println("Estos son los datos de su nuevo jugador: ");
			equipo[id].mostrarJugador();							
		}
		
		System.out.println("Su nuevo equipo ahora es: ");
		mostrar_equipo();
	return equipo;
	}

public Jugadores[] mostrar_equipo(){
		System.out.println("Los jugadores de este equipo son: ");
		for(int it=0; it<=6;it++){
			
			equipo[it].mostrarJugador();
		}
		return equipo;
	}
}
