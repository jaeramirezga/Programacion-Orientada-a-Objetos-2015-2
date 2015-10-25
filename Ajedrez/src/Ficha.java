import java.util.ArrayList;


public class Ficha {
	int x , y;
	String color;
	String tipo;

	Ficha (int x , int y, String color,String tipo){
		this.x = x;
		this.y = y;
		this.color = color;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String ans = "";
		ans += color;
		ans += tipo;
		return ans;
	}

	public ArrayList<Pareja> desplegarOpciones(Tablero jubilado) {
		System.out.println("No hay movimientos disponibles");
		return new ArrayList<>();
	}
}

class Peon extends Ficha {
	
	public Peon (int px , int py, String c,String t){
		super (px , py, c, "Peon");  
	}
	public String getColor() {
		return color;
	}
	
	public ArrayList<Pareja> desplegarOpciones(Tablero Jubilado) {
		ArrayList<Pareja> posiblesMovimientos = new ArrayList<>();
		if(color.equals("Blanco")) {
			int nx = x + (-1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) { // False, porque quiero verificar que no haya nadie
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) { // true, porque quiero verificar que haya alguien del otro color
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		else { // Si es negro
			int nx = x + (1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		return posiblesMovimientos;
	}
	
	public boolean verificar(int a, int b, Tablero J, boolean bandera) {
		if(bandera == true) { // Verificar que haya alguien- moverme en diagonal
			if(color.equals("Blanco")) {
				/*if(J.getFicha(a, b).color.equals("Negro"))
					return true;
				else 
					return false;*/
				return J.getFicha(a, b).color.equals("Negro");
			}
			else { // Soy negro
				return J.getFicha(a, b).color.equals("Blanco");
			}
		}
		else { // Verificar que no haya nadie
			return J.getFicha(a, b).color.equals("nada");
		}
	}
}

class Rey extends Ficha {
	public Rey (int rx , int ry, String c,String t) {
		super (rx , ry, c, "Rey");
	}
	public ArrayList<Pareja> desplegarOpciones(Tablero Jubilado) {
		ArrayList<Pareja> posiblesMovimientos = new ArrayList<>();
		int nx;
		int ny;
		for (int i = -1 ; i <= 1 ; i++) {
			for (int j = -1 ; j <= 1 ; j++) {
				nx = x + i;
				ny = y + j;
				if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && !color.equals(Jubilado.getFicha(nx, ny).color) && noJaque(nx, ny, Jubilado)) { // False, porque quiero verificar que no haya nadie
					System.out.println(nx + " - " + ny);
					posiblesMovimientos.add(new Pareja(nx, ny));
				}
			}
		}
	
		return posiblesMovimientos;
	}
	
	public boolean noJaque(int a, int b, Tablero J) {
		int nx, ny;
		for (int i = -1 ; i <= 1 ; i++) {
			for (int j = -1 ; j <= 1 ; j++) {
				nx = a + i;
				ny = b + j;
				if(nx == x && ny == y) continue; // Mi misma posicion
				if(nx >= 0 && ny >= 0 && nx < J.ancho && ny < J.largo && !(J.getFicha(nx, ny).color.equals("nada") || J.getFicha(nx, ny).color.equals(color)) ) { // Hay jaque
					return false;
				}
			}
		}
		return true;
	}
}

class Reina extends Ficha {
	public Reina (int rnx , int rny, String c,String t){
		super (rnx , rny, c, "Reina");
	}
	public ArrayList<Pareja> desplegarOpciones(Tablero Jubilado) {
		ArrayList<Pareja> posiblesMovimientos = new ArrayList<>();
		if(color.equals("Blanco")) {
			int nx = x + (-1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) { // False, porque quiero verificar que no haya nadie
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) { // true, porque quiero verificar que haya alguien del otro color
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		else { // Si es negro
			int nx = x + (1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		return posiblesMovimientos;
	}
	
	public boolean verificar(int a, int b, Tablero J, boolean bandera) {
		if(bandera == true) { // Verificar que haya alguien
			if(color.equals("Blanco")) {
				/*if(J.getFicha(a, b).color.equals("Negro"))
					return true;
				else 
					return false;*/
				return J.getFicha(a, b).color.equals("Negro");
			}
			else { // Soy negro
				return J.getFicha(a, b).color.equals("Blanco");
			}
		}
		else { // Verificar que no haya nadie
			return J.getFicha(a, b).color.equals("nada");
		}
	}

}

class Alfil extends Ficha {
	public Alfil (int ax , int ay, String c,String t){
		super (ax , ay, c, "Alfil");
	}
	public ArrayList<Pareja> desplegarOpciones(Tablero Jubilado) {
		ArrayList<Pareja> posiblesMovimientos = new ArrayList<>();
		if(color.equals("Blanco")) {
			int nx = x + (-1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) { // False, porque quiero verificar que no haya nadie
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) { // true, porque quiero verificar que haya alguien del otro color
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		else { // Si es negro
			int nx = x + (1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		return posiblesMovimientos;
	}
	
	public boolean verificar(int a, int b, Tablero J, boolean bandera) {
		if(bandera == true) { // Verificar que haya alguien
			if(color.equals("Blanco")) {
				/*if(J.getFicha(a, b).color.equals("Negro"))
					return true;
				else 
					return false;*/
				return J.getFicha(a, b).color.equals("Negro");
			}
			else { // Soy negro
				return J.getFicha(a, b).color.equals("Blanco");
			}
		}
		else { // Verificar que no haya nadie
			return J.getFicha(a, b).color.equals("nada");
		}
	}
}

class Caballo extends Ficha {
	public Caballo (int cx , int cy, String c,String t){
		super (cx , cy, c, "Caballo");
	}
	public ArrayList<Pareja> desplegarOpciones(Tablero Jubilado) {
		ArrayList<Pareja> posiblesMovimientos = new ArrayList<>();
		if(color.equals("Blanco")) {
			int nx = x + (-1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) { // False, porque quiero verificar que no haya nadie
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) { // true, porque quiero verificar que haya alguien del otro color
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		else { // Si es negro
			int nx = x + (1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		return posiblesMovimientos;
	}
	
	public boolean verificar(int a, int b, Tablero J, boolean bandera) {
		if(bandera == true) { // Verificar que haya alguien
			if(color.equals("Blanco")) {
				/*if(J.getFicha(a, b).color.equals("Negro"))
					return true;
				else 
					return false;*/
				return J.getFicha(a, b).color.equals("Negro");
			}
			else { // Soy negro
				return J.getFicha(a, b).color.equals("Blanco");
			}
		}
		else { // Verificar que no haya nadie
			return J.getFicha(a, b).color.equals("nada");
		}
	}
}

class Torre extends Ficha {
	public Torre (int tx , int ty, String c,String t){
		super (tx , ty, c, "Torre");
	}
	public ArrayList<Pareja> desplegarOpciones(Tablero Jubilado) {
		ArrayList<Pareja> posiblesMovimientos = new ArrayList<>();
		if(color.equals("Blanco")) {
			int nx = x + (-1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) { // False, porque quiero verificar que no haya nadie
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) { // true, porque quiero verificar que haya alguien del otro color
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (-1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		else { // Si es negro
			int nx = x + (1);
			int ny = y + (0);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, false)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (-1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
			nx = x + (1);
			ny = y + (1);
			if(nx >= 0 && ny >= 0 && nx < Jubilado.ancho && ny < Jubilado.largo && verificar(nx, ny, Jubilado, true)) {
				System.out.println(nx + " - " + ny);
				posiblesMovimientos.add(new Pareja(nx, ny));
			}
		}
		return posiblesMovimientos;
	}
	
	public boolean verificar(int a, int b, Tablero J, boolean bandera) {
		if(bandera == true) { // Verificar que haya alguien
			if(color.equals("Blanco")) {
				/*if(J.getFicha(a, b).color.equals("Negro"))
					return true;
				else 
					return false;*/
				return J.getFicha(a, b).color.equals("Negro");
			}
			else { // Soy negro
				return J.getFicha(a, b).color.equals("Blanco");
			}
		}
		else { // Verificar que no haya nadie
			return J.getFicha(a, b).color.equals("nada");
		}
	}

}

class Pareja {
	int x, y;
	
	public Pareja(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
