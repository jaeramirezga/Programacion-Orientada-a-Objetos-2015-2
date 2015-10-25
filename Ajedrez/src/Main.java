import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static boolean jugador1 = true;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new FileInputStream("texto.txt"));
		
		boolean esta = true;
		ArrayList<String> all = new ArrayList<>();
		while(sc.hasNextLine()) {
			String a = sc.next();
			String b = sc.next();
			all.add(a);
			all.add(b);
			if(a.equals("Andres")) {
				System.out.println(a + ", " + b);
				esta = false;
			}
		}
		
		if(esta == false) {
			FileWriter fichero = new FileWriter("texto.txt");
			PrintWriter pw = new PrintWriter(fichero);
			for(int i = 0; i < all.size(); i += 2) {
				pw.println(all.get(i) + " " + all.get(i + 1));
			}
		
			String palabra = "Jeje";
			pw.println(palabra + " " + "otrapalabra");
			fichero.close();
		}

		System.out.println("Bienvenidos a Ajedrez");
		SelectorInicial();

	}

	static void SelectorInicial() {
		System.out.println("Digite: 1. Jugar 2. Highscores 3. Salir");
		Scanner sc = new Scanner(System.in);
		int SelecInicial = sc.nextInt();
		switch(SelecInicial){
		case 1: 

			int SelecJuego;
			do{
				System.out.println("Seleccione la modalidad de ajedrez que desea jugar\n1.Jubilado 2.Mini 3 x 3 3. Volver al menu inicial");
				SelecJuego = sc.nextInt();
			}
			while(SelecJuego < 1 || SelecJuego > 3 );

			switch(SelecJuego){
			case 1:
				System.out.println("1.Jubilado");
				Tablero Jubilado = new Tablero (8,8);
				for (int i = 0; i  < 8 ; i++ ) {
					Jubilado.MoverFicha(1, i, new Peon(1, i, "Negro","Peon"));
					Jubilado.MoverFicha(6, i, new Peon(6, i, "Blanco","Peon"));
				}
				Jubilado.MoverFicha(0, 4, new Rey(0, 4, "Negro","Rey"));
				Jubilado.MoverFicha(7, 4, new Rey(7, 4, "Blanco","Rey"));
				Jubilado.imprimir();
				
				
				int posx, posy, posx2, posy2;
				int finalGame = 0;
				int playerno = 0;
				int player;
				while (finalGame < 3 || finalGame > 4 ){
				
					player = playerno%2;
				switch(player){
				case 0:
					System.out.println("Digite 1. Para continuar con el Juego 2. Para Finalizar la partida");
					
				    int selectEnCurso = sc.nextInt();
				    if (selectEnCurso ==2 ){
				    	finalGame = 3;
				    	break;
				    }
				    Jubilado.imprimir();	
					do {
						System.out.println("Ingrese una posicion para una ficha blanca");
						posx = sc.nextInt();
						posy = sc.nextInt();
					}
					while(!((jugador1 && Jubilado.getFicha(posx, posy).color.equals("Blanco")) || (!jugador1 && Jubilado.getFicha(posx, posy).color.equals("Negro"))));

					ArrayList<Pareja> aux = Jubilado.getFicha(posx, posy).desplegarOpciones(Jubilado); // <- desplegar
					
					do {
						System.out.println("Ingrese la posicion final a la cual quiere mover la ficha blanca");
						posx2 = sc.nextInt();
						posy2 = sc.nextInt();
					}
					while(posx2<0 || posx2>8 || posy2<0 || posy2>8);
					
					hacerMovimiento(posx, posy, posx2, posy2, Jubilado, aux);
					playerno++;
					
					break;
					
					case 1:
					// Pedir a donde quiero mover
						System.out.println("Digite 1. Para continuar con el Juego 2. Para Finalizar la partida");
					    int selectEnCurso2 = sc.nextInt();
					    if (selectEnCurso2 ==2 ){
					    	finalGame = 3;
					    	break;
					    	
					    }
					
					Jubilado.imprimir();
					do {
						System.out.println("Ingrese una posicion x,y para una ficha negra ");
						posx = sc.nextInt();
						posy = sc.nextInt();
					}
					while(!((jugador1 || Jubilado.getFicha(posx, posy).color.equals("Negro")) && (!jugador1 || Jubilado.getFicha(posx, posy).color.equals("Blanco"))));
					
					ArrayList<Pareja> aux2 = Jubilado.getFicha(posx, posy).desplegarOpciones(Jubilado); // <- desplegar
					
					do {
						System.out.println("Ingrese la posicion final a la cual quiere mover la ficha negra");
						posx2 = sc.nextInt();
						posy2 = sc.nextInt();
					}
					while(posx2<0 || posx2>7 || posy2<0 || posy2>0);
					
					//Esta condion se debe cambiar para que este pero en los posibles movimientos
					
					hacerMovimiento(posx, posy, posx2, posy2, Jubilado, aux2);
					playerno++;
					break;

				}
			
								
			}
			if(finalGame == 3 ){
				System.out.println("Digite el resultado final de la partida:\n1.Ganan Blancas 2.Ganan Negras 3.Empate");
				int Ganador;
				do{
					Ganador = sc.nextInt();
				}while(Ganador < 1 || Ganador > 3);
				//Aca se debe poner el sumador de ganador al jugador
				break;
			}
			
			break;
			case 2:
				System.out.println("Tablero 3x3");
				Tablero Mini = new Tablero (3,3);
				Mini.imprimir();
				break;
				
			case 3: 
				SelectorInicial();
				break;

			default:
				System.out.println("Numero invalido, ingrese otro numero porfavor...");
				break;
			}
			
			System.out.println("Finalizo la partida");
			
			SelectorInicial();
			
			break;

		case 2:
			System.out.println("Estos son los HighScores");
			System.out.println("Digite 1. Para volver al menu inicial 2. Para salir del juego");
			int SelecEnHighscores;
			do{
				SelecEnHighscores = sc.nextInt();
			}while(SelecEnHighscores < 1 || SelecEnHighscores > 2);
			switch(SelecEnHighscores){
			case 1:
				SelectorInicial();
				break;
			case 2:
				System.out.println("Gracias por usar Ajedrez, Vuelva pronto");
				break;
			
			}
		case 3:
			break;
			
		}

	}
	
	static void hacerMovimiento(int xi, int yi, int xf, int yf, Tablero j, ArrayList<Pareja> aux) {
		Ficha fichaActual = j.getFicha(xi, yi);
		Pareja npos = new Pareja(xf, yf);
		for(int i = 0; i < aux.size(); i++) {
			if(aux.get(i).x == npos.x && aux.get(i).y == npos.y) {
				fichaActual.x = xf;
				fichaActual.y = yf;
				j.MoverFicha(xf, yf, fichaActual);
				j.BorrarFicha(xi, yi);
				System.out.println("Movimiento Satisfactorio");
				jugador1 = !jugador1;
				j.imprimir();
				return;
			}
		}
		System.out.println("Movimiento Invalido");

	}
}


