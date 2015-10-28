import java.util.Scanner;

public class Main {
	//Crearemos una clase main

	public static void main(String[] args) {
		//Declararemos nuestro main
		Scanner sc = new Scanner(System.in);
		//Crearemos una clase de tipo scanner
		double[] pointX1 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los primeros puntos en x de cada una de las figuras
		double[] pointX2 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los segundos puntos en x de cada una de las figuras
		double[] pointX3 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los terceros puntos en x de cada una de las figuras
		double[] pointX4 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los cuartos puntos en x de cada una de las figuras
		
		double[] pointY1 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los primeros puntos en y de cada una de las figuras
		double[] pointY2 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los segundos puntos en y de cada una de las figuras
		double[] pointY3 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los terceros puntos en y de cada una de las figuras
		double[] pointY4 = new double [5];
		//Crearemos un arreglo puntos, en los cuales guardaremos los cuartos puntos en y de cada una de las figuras
		
		for (int i = 0 ; i < 5 ; i++){
			//Crearemos un for
			if (i == 0){
				//Si i = 0, entonces vamos a introducir los datos para Quadrilateral 
				System.out.println("Quadrilateral");
			}
			if (i == 1){
				//Si i = 1, entonces vamos a introducir los datos para Trapezoid
				System.out.println("Trapezoid");
			}
			if (i == 2){
				//Si i = 2, entonces vamos a introducir los datos para Parallelogram
				System.out.println("Parallelogram");
			}
			if (i == 3){
				//Si i = 3, entonces vamos a introducir los datos para Rectangle
				System.out.println("Rectangle");
			}
			if (i == 4){
				//Si i = 4, entonces vamos a introducir los datos para Square
				System.out.println("Square");
			}
			
			System.out.print("Point 1 en X: ");
			pointX1 [i] = sc.nextDouble();
			
			System.out.print("Point 1 en Y: ");
			pointY1 [i] = sc.nextDouble();
			
			System.out.print("Point 2 en X: ");
			pointX2 [i] = sc.nextDouble();
			
			System.out.print("Point 2 en Y: ");
			pointY2 [i] = sc.nextDouble();
			
			System.out.print("Point 3 en X: ");
			pointX3 [i] = sc.nextDouble();
			
			System.out.print("Point 3 en Y: ");
			pointY3 [i] = sc.nextDouble();
			
			System.out.print("Point 4 en X: ");
			pointX4 [i] = sc.nextDouble();
			
			System.out.print("Point 4 en Y: ");
			pointY4 [i] = sc.nextDouble();
			
		}
		
		Quadrilateral Figura1 = new Quadrilateral(new Pair(pointX1 [0], pointY1 [0]),new Pair(pointX2 [0],pointY2 [0]),new Pair(pointX3 [0],pointY3 [0]), new Pair(pointX4 [0],pointY4 [0]));
		//Instanciaremos un objeto de tipo Quadrirateral, y le pasaremos los valores recibidos anteriormente
		Trapezoid Figura2 = new Trapezoid(new Pair(pointX1 [1], pointY1 [1]),new Pair(pointX2 [1],pointY2 [1]),new Pair(pointX3 [1],pointY3 [1]),new Pair(pointX4 [1],pointY4 [1]));
		//Instanciaremos un objeto de tipo Trapezoid, y le pasaremos los valores recibidos anteriormente
		Parallelogram Figura3 = new Parallelogram(new Pair(pointX1 [2], pointY1 [2]),new Pair(pointX2 [2],pointY2 [2]),new Pair(pointX3 [2],pointY3 [2]),new Pair(pointX4 [2],pointY4 [2]));
		//Instanciaremos un objeto de tipo Parallelogram, y le pasaremos los valores recibidos anteriormente
		Rectangle Figura4 = new Rectangle(new Pair(pointX1 [3], pointY1 [3]),new Pair(pointX2 [3],pointY2 [3]),new Pair(pointX3 [3],pointY3 [3]),new Pair(pointX4 [3],pointY4 [3]));
		//Instanciaremos un objeto de tipo Rectangle, y le pasaremos los valores recibidos anteriormente
		Square Figura5 = new Square(new Pair(pointX1 [4], pointY1 [4]),new Pair(pointX2 [4], pointY2 [4]),new Pair(pointX3 [4],pointY3 [4]),new Pair(pointX4 [4],pointY4 [4]));
		//Instanciaremos un objeto de tipo Square, y le pasaremos los valores recibidos anteriormente
		
		System.out.println("Quadrilateral");
		System.out.println("(" + Figura1.p1.x + "," + Figura1.p1.y + "),(" + Figura1.p2.x + "," + Figura1.p2.y + "),(" + Figura1.p3.x + "," + Figura1.p3.y + "),(" + Figura1.p4.x + "," + Figura1.p4.y + ")");
		//Imprimiremos las coordenadas
		
		System.out.println("Trapezoid");
		System.out.println("(" + Figura2.p1.x + "," + Figura2.p1.y + "),(" + Figura2.p2.x + "," + Figura2.p2.y + "),(" + Figura2.p3.x + "," + Figura2.p3.y + "),(" + Figura2.p4.x + "," + Figura2.p4.y + ")");
		//Imprimiremos las coordenadas
		System.out.println("Height is:" + Figura2.getHeight( Figura2.p1 , Figura2.p3 ));
		//Imprimiremos la altura
		System.out.println("Area is:" + Figura2.area());
		//Imprimiremos el area
		
		System.out.println("Parallelogram");
		System.out.println("(" + Figura3.p1.x + "," + Figura3.p1.y + "),(" + Figura3.p2.x + "," + Figura3.p2.y + "),(" + Figura3.p3.x + "," + Figura3.p3.y + "),(" + Figura3.p4.x + "," + Figura3.p4.y + ")");
		//Imprimiremos las coordenadas
		System.out.println("Width is:" + Figura3.getDist( Figura3.p1 , Figura3.p2 ));
		//Imprimiremos el ancho
		System.out.println("Height is:" + Figura3.getHeight( Figura3.p1 , Figura3.p3 ));
		//Imprimiremos la altura
		System.out.println("Area is:" + Figura3.area());
		//Imprimiremos el area
		
		System.out.println("Rectangle");
		System.out.println("(" + Figura4.p1.x + "," + Figura4.p1.y + "),(" + Figura4.p2.x + "," + Figura4.p2.y + "),(" + Figura4.p3.x + "," + Figura4.p3.y + "),(" + Figura4.p4.x + "," + Figura4.p4.y + ")");
		//Imprimiremos las coordenadas
		System.out.println("Width is:" + Figura4.getDist( Figura4.p1 , Figura4.p2 ));
		//Imprimiremos el ancho
		System.out.println("Height is:" + Figura4.getHeight( Figura4.p1 , Figura4.p3 ));
		//Imprimiremos la altura
		System.out.println("Area is:" + Figura4.area());
		//Imprimiremos el area
		
		System.out.println("Square");
		System.out.println("(" + Figura5.p1.x + "," + Figura5.p1.y + "),(" + Figura5.p2.x + "," + Figura5.p2.y + "),(" + Figura5.p3.x + "," + Figura5.p3.y + "),(" + Figura5.p4.x + "," + Figura5.p4.y + ")");
		//Imprimiremos las coordenadas
		System.out.println("Side is:" + Figura5.getDist( Figura5.p1 , Figura5.p2 ));
		//Imprimiremos el tamaño lado
		System.out.println("Area is:" + Figura5.area());
		//Imprimiremos el area
		
	}
}
