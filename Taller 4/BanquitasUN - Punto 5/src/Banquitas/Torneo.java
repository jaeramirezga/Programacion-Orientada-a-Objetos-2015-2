package Banquitas;

public class Torneo {
	Scanner sc = new Scanner (System.in);
	new Equipos [] Equipos_Torneo = new Equipos [6];
	
	public Torneo(){
	}
	
	public void agregarEquipos(){
		System.out.println("Ingrese los datos de los equipos...");
		for(int i=0; i <6 ; i++){
			
			System.out.println("Equipo No. "+ i);
			Equipos[i].crearEquipo();
			Jugadores[] agregarJugadores();
			
										
		}
		
	public void Partido(Equipos a,Equipos b){
		int[]  goles = new int[2];
		do{
			System.out.println("Digite la cantidad de goles anotados por el equipo "+ a.nombre );
			goles[0] = sc.nextInt();
		}while(goles[0] < 0);
		
		do{
			System.out.println("Digite la cantidad de goles anotados por el equipo "+ b.nombre);
			goles[1] = sc.nextInt();
		}while(goles[1] < 0);
				
		if(goles[0] > goles[1]){
			System.out.println("El equipo ganador es ");
			a.PartidoGanado();
			
		}
		if(goles[0] == goles[1]){
			System.out.println("El resultado del partido es un empate ");
			a.PartidoEmpatado();
			b.PartidoEmpatado();
		}
		if(goles[0] < goles[1]){
			System.out.println("El equipo ganador es ");
			b.PartidoGanado();
		}
	}
	

}
