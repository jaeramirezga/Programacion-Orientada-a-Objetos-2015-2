


public class Rectangulo {
	// Creamos una Clase llamada Rectangulo
	
	public Rectangulo () {
		//Creamos un constructor vacio de Rectangulo
	}

	private double largo = 1;
	// Crearemos una Variable Privada para el largo del rectangulo
	private double ancho = 1;
	// Crearemos una Variable Privada para el Ancho del rectangulo
	
	public double perimetro(){
		// Crearemos un metodo llamado perimetro
		return (2*largo)+(2*ancho);
		// Retornaremos la formula correspondiente al perimetro
	}
	
	public double area(){
		// Crearemos un metodo llamado area
		return ancho*largo;
		// Retornaremos la formula correspondiente al area
	}
	
	public void setLargo(double nLargo){
		// Crearemos un metodo de tipo Set, para modificar el valor de Largo
		if( nLargo > 0.0 && nLargo <= 20.0 ){
			// Pondremos un condicional, para asegurarnos que los valores ingresados estan entre (0, 20]
			largo = nLargo;	
			// Modificamos el valor de largo
		}
	}
	public void setAncho(double nAncho){
		// Crearemos un metodo de tipo Set, para modificar el valor de Ancho
		if( nAncho > 0.0 && nAncho <= 20.0 ){
			// Pondremos un condicional, para asegurarnos que los valores ingresados estan entre (0, 20]
			largo = nAncho;	
			// Modificamos el valor de ancho
		}
	}
	
	public double getLargo (){
		// Crearemos un metodo de tipo Get, para regresar el valor de Largo
		return largo;
		// Retornaremos largo
	}
	public double getAncho (){
		// Crearemos un metodo de tipo Get, para regresar el valor de Ancho
		return ancho;
		// Retornaremos Ancho
	}
	
}
