package Banquitas;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a BanquitasUN");
		System.out.println("Por favor ingrese el numero que le corresponde a la accion que desea ejecutar...");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		
		Equipos jugadores = new Equipos();
		
		jugadores.agregarJugadores();
	}

}
