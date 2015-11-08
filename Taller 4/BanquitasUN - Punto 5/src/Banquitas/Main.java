package Banquitas;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a BanquitasUN");
		System.out.println("Por favor ingrese el numero que le corresponde a la accion que desea ejecutar...");
		System.out.println("1.Agregar o Editar equipo");
		System.out.println("2.Tabla de Posiciones y Goleadores");
		System.out.println("3.Ingresar resultados de torneo");
		System.out.println("4.Numero de equipos en competicion");
		
		Scanner menu = new Scanner(System.in);	
		int men = menu.nextInt();
		Equipos jugadores = new Equipos();		
		
		switch(men){
		
		case 1:
			
			int Select;
			do{
				System.out.println("Seleccione la accion\n1.Agregar Equipo \n2.Editar Equipo \n3.Eliminar Equipo");
				Select = menu.nextInt();
			}
			while(Select < 1 || Select > 3 );
			switch(Select){
			case 1:
				jugadores.crearEquipo();
				jugadores.agregarJugadores();
				break;

			case 2:
				
				break;
			case 3:
				
				break;

			default:
				System.out.println("Numero invalido, ingrese otro numero porfavor...");
				break;
			}
						
			break;
		
		case 2:
			
			break;
			
		case 3:
		
			break;
			
		case 4:
			
			break;
		}
		
		
	}

}
