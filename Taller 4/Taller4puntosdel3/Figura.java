package Taller4puntosdel3;

public abstract class Figura {
	
	protected Pair p1, p2, p3, p4;
	// Instanciaremos a Pair, y crearemos 4 objetos de este tipo
	
	public Figura(Pair a, Pair b, Pair c, Pair d) {
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
	
	public double getDist(Pair a, Pair b) {
		// Crearemos un metodo de tipo get, con el cual recibiremos las coordenadas de dos puntos
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
		// Retornaremos el valor de la distancia entre los dos puntos
	}
	
	public double getHeight(Pair a, Pair b){
		// Crearemos un metodo de tipo get, con el cual recibiremos las coordenadas de dos puntos
		return Math.sqrt((a.y - b.y)*(a.y - b.y));
		// Retornaremos el valor de la altura
	}

}

class Quadrilateral extends Figura {
	
	Quadrilateral(Pair qx, Pair qy, Pair qz,Pair qw){
		super (qx,qy,qz,qw);
	}
	
}


class Trapezoid extends Figura{
	// Se crea una clase llamada Trapezoid, la cual es hija de Quadrilateral
	
	public Trapezoid(Pair tx, Pair ty, Pair tz, Pair tw){
		// Crearemos un constructor 
		super(tx,ty,tz,tw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double width1 = getDist(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double width2 = getDist(p3, p4);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double height = getHeight(p1, p3);
		// Crearemos una variable, con la cual sabremos la Altura de la figura
		return (((width1)+(width2))*height)/2;
		// Retornaremos el valor del area
	}
	
}

class Parallelogram extends Figura{
	// Se crea una clase llamada Parallelogram, la cual es hija de Quadrilateral
	
	public Parallelogram(Pair px, Pair py, Pair pz, Pair pw){
		// Crearemos un constructor 
		super(px,py,pz,pw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double width1 = getDist(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double height = getHeight(p1, p3);
		// Crearemos una variable, con la cual sabremos la Altura de la figura
		return ((width1)*height);
		// Retornaremos el valor del area
	}
	
}

class Rectangle extends Figura{
	// Se crea una clase llamada Rectangle, la cual es hija de Quadrilateral
	
	public Rectangle(Pair rx, Pair ry, Pair rz, Pair rw){
		// Crearemos un constructor 
		super(rx,ry,rz,rw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double width1 = getDist(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		double height = getHeight(p1, p3);
		// Crearemos una variable, con la cual sabremos la Altura de la figura
		return ((width1)*height);
		// Retornaremos el valor del area
	}
	
}

class Square extends Figura {
	// Se crea una clase llamada Square, la cual es hija de Quadrilateral
	
	public Square(Pair sx, Pair sy, Pair sz, Pair sw) {
		// Crearemos un constructor 
		super(sx, sy, sz, sw);
		// Llamaremos el constructor de la clase padre
	}
	
	public double area() {
		// Crearemos un metodo llamado area
		double side = getDist(p1, p2);
		// Crearemos una variable, con la cual sabremos la distancia de uno de los lados
		return side * side;
		// Retornaremos el valor del area
	}

}
