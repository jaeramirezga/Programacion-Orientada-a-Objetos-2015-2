# Talleres
import java.util.Scanner;

public class PointC {

	public static void main(String[] args) {
		int suma = 0, numeros = 0;
		Scanner leer = new Scanner(System.in);
		
		do{
			int numero = leer.nextInt();
			if (numero == 9999)
				break;
			numeros++;
			suma += numero;
		  }while( numero != 9999);
		System.out.print(suma/numeros);
		}
			
	}

