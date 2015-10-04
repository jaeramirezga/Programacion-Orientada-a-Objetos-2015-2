
class Pair {
	//Se crea una clase llamada pair
	double x, y;
	//Crearemos unas variables de tipo double para poder guardar 
	
	public Pair(double x, double y) {
		//Recibiremos un valor de tipo double x y y
		this.x = x;
		//Le pasaremos a nuestra variable x el valor recibido en nuestro constructor
		this.y = y;
		//Le pasaremos a nuestra variable y el valor recibido en nuestro constructor
	}
	
}

public class Quadrilateral {
	//Crearemos una clase llamada Quadrilateral 
	protected Pair p1, p2, p3, p4;
	// Instanciaremos a Pair, y crearemos 4 objetos de este tipo
	
	public Quadrilateral(Pair a, Pair b, Pair c, Pair d) {
		//En nuestro contstructor recibiremos 4 puntos;
		p1 = a;
		// Le pasaremos los valores recibidos en nuestro constructor, al punto p1
		p2 = b;
		// Le pasaremos los valores recibidos en nuestro constructor, al punto p2
		p3 = c;
		// Le pasaremos los valores recibidos en nuestro constructor, al punto p3
		p4 = d;
		// Le pasaremos los valores recibidos en nuestro constructor, al punto p4
	}
	
	public double getDist1(Pair a, Pair b) {
		// Crearemos un metodo de tipo get, con el cual recibiremos las coordenadas de dos puntos
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
		// Retornaremos el valor de la distancia entre los dos puntos
	}
	
	public double getDist2(Pair c, Pair d) {
		// Crearemos un metodo de tipo get, con el cual recibiremos las coordenadas de dos puntos
		return Math.sqrt((c.x - d.x) * (c.x - d.x) + (c.y - d.y) * (c.y - d.y));
		// Retornaremos el valor de la distancia entre los dos puntos
	}
	
	public double getHeight1(Pair a, Pair c){
		// Crearemos un metodo de tipo get, con el cual recibiremos las coordenadas de dos puntos
		return Math.sqrt((a.y - c.y)*(a.y - c.y));
		// Retornaremos el valor de la altura
	}
	
	public double getHeight2(Pair b, Pair d){
		// Crearemos un metodo de tipo get, con el cual recibiremos las coordenadas de dos puntos
		return Math.sqrt((b.y - d.y)*(b.y - d.y));
		// Retornaremos el valor de la altura
	}
	
}


class Trapezoid extends Quadrilateral{
	// Se crea una clase llamada Trapezoid, la cual es hija de Quadrilateral
	
	public Trapezoid(Pair tx, Pair ty, Pair tz, Pair tw){
		// Crearemos un constructor 
		super(tx,ty,tz,tw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double width1 = getDist1(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double width2 = getDist2(p3, p4);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double height = getHeight1;
		// Crearemos una variable, con la cual sabremos la Altura de la figura
		return (((width1)+(width2))*height)/2;
		// Retornaremos el valor del area
	}
	
}

class Parallelogram extends Quadrilateral{
	// Se crea una clase llamada Parallelogram, la cual es hija de Quadrilateral
	
	public Parallelogram(Pair px, Pair py, Pair pz, Pair pw){
		// Crearemos un constructor 
		super(px,py,pz,pw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double width1 = getDist1(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double height = getHeight1;
		// Crearemos una variable, con la cual sabremos la Altura de la figura
		return ((width1)*height);
		// Retornaremos el valor del area
	}
	
}

class Rectangle extends Quadrilateral{
	// Se crea una clase llamada Rectangle, la cual es hija de Quadrilateral
	
	public Rectangle(Pair rx, Pair ry, Pair rz, Pair rw){
		// Crearemos un constructor 
		super(rx,ry,rz,rw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double width1 = getDist1(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double height = getHeight1;
		// Crearemos una variable, con la cual sabremos la Altura de la figura
		return ((width1)*height);
		// Retornaremos el valor del area
	}
	
}

class Square extends Quadrilateral {
	// Se crea una clase llamada Square, la cual es hija de Quadrilateral
	
	public Square(Pair sx, Pair sy, Pair sz, Pair sw) {
		// Crearemos un constructor 
		super(sx, sy, sz, sw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double side = getDist1(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		return side * side;
		// Retornaremos el valor del area
	}

}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[] puntosX1 = new double [5];
	double[] puntosX2 = new double [5];
	double[] puntosX3 = new double [5];
	double[] puntosX4 = new double [5];
	
	double[] puntosY1 = new double [5];
	double[] puntosY2 = new double [5];
	double[] puntosY3 = new double [5];
	double[] puntosY4 = new double [5];
	
	
	for (int i = 0 ; i < 4 ; i++){
		System.out.print("Digite el punto " + 1 + " en X: ");
		puntosX1 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 1 + " en Y: ");
		puntosY1 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 2 + " en X: ");
		puntosX2 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 2 + " en Y: ");
		puntosY2 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 3 + " en X: ");
		puntosX3 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 3 + " en Y: ");
		puntosY3 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 4 + " en X: ");
		puntosX4 [i] = Scanner.sc;
		System.out.println();
		System.out.print("Digite el punto " + 4 + " en Y: ");
		puntosY4 [i] = Scanner.sc;
		System.out.println();
	}
	Figura1 = new Quadrilateral((puntosX1 [0], puntosY1 [0]),(puntosX2 [0],puntosY2 [0]),(puntosX3 [0],puntosY3 [0]),(puntosX4 [0],puntosY4 [0]));
	Figura2 = new Trapezoid((puntosX1 [1], puntosY1 [1]),(puntosX2 [1],puntosY2 [1]),(puntosX3 [1],puntosY3 [1]),(puntosX4 [1],puntosY4 [1]));
	Figura3 = new Parallelogram((puntosX1 [2], puntosY1 [2]),(puntosX2 [2],puntosY2 [2]),(puntosX3 [2],puntosY3 [2]),(puntosX4 [2],puntosY4 [2]));
	Figura4 = new Rectangle((puntosX1 [3], puntosY1 [3]),(puntosX2 [3],puntosY2 [3]),(puntosX3 [3],puntosY3 [3]),(puntosX4 [3],puntosY4 [3]));
	Figura5 = new Square((puntosX1 [4], puntosY1 [4]),(puntosX2 [4], puntosY2 [4]),(puntosX3 [4],puntosY3 [4]),(puntosX4 [4],puntosY4 [4]));
	
}