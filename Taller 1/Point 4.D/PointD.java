import java.util.Scanner;
//Se importa la libreria Scanner, para poder entrar valores

public class PointD {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Se crea un objeto de tipo Scanner, para poder leer los numeros que se ingresaran
		int [] valordebilletes = {50000 , 20000 , 10000, 5000, 2000, 1000};
		//crearemos un arreglo con los valores de los billetes
		int numerodebilletes = 0;
		//crearemos una variable entera para el numero de billetes a regresar
		
		int [] valordemonedas = {500 , 200 , 100 , 50};
		//crearemos un arreglo con los valores de las monedas
		int numerodemonedas = 0;
		//crearemos una variable entera para el numero de monedas a regresar
		
		System.out.print("Dijite el valor a retirar: ");
		int valor = leer.nextInt();
		//crearemos una variable, la cual le daremos el valor del numero ingresado
		int falta = valor;
		//crearemos una variable entera y le daremos el valor del numero ingresado
		for(int n = 0; n < 6 ; n++){
			//crearemos un ciclo con el cual recorreremos el arreglo de los valores de los billetes
				if(falta >= valordebilletes [n]){
					//crearemos una condicion, en la cual miraremos si nos sirve el valor del billete 
					//en la posicion del arreglo en que estemos, si es menor, seguiremos
				numerodebilletes = falta/valordebilletes [n];
				//le daremos el valor numero de billetes a la division de lo que nos falta por devolver entre 
				//el valor de los billetes, asi obtendremos el valor del numero de billetes de esa denominacion 
				//a devolver
				falta = falta%valordebilletes [n];
				//le daremos el valor lo que falta por devolver al modulo de lo que nos falta por devolver entre 
				//el valor de los billetes, asi obtendremos el valor de lo que nos falta por devolver
			    System.out.println("Se le devuelve "+numerodebilletes+" billetes de $"+ valordebilletes [n]);
				}
		}
		for(int n = 0; n < 4 ; n++){
			//crearemos un ciclo con el cual recorreremos el arreglo de los valores de las monedas
				if(falta >= valordemonedas [n]){
					//crearemos una condicion, en la cual miraremos si nos sirve el valor de la moneda 
					//en la posicion del arreglo en que estemos, si es menor, seguiremos
				numerodemonedas = falta/valordemonedas [n];
				//le daremos el valor numero de monedas a la division de lo que nos falta por devolver entre 
				//el valor de las monedas, asi obtendremos el valor del numero de monedas de esa denominacion 
				//a devolver
				falta = falta%valordemonedas [n];
				//le daremos el valor lo que falta por devolver al modulo de lo que nos falta por devolver entre 
				//el valor de las monedas, asi obtendremos el valor de lo que nos falta por devolver
			    System.out.println("Se le devuelve "+numerodemonedas+" monedas de $"+ valordemonedas [n]);
				}
		}
		

	}

}
