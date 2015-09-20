# Programacion-Orientada-a-Objetos-2015-2
import java.util.Scanner;

public class PrimeNumbers {

	    public static void main(String[] args) {
	    	
	        int numeroInicial = 1; 
	        Scanner in = new Scanner(System.in);
	        System.out.println("Ingrese un numero: ");  
	        int numeroFinal = in.nextInt();  				// Escaneamos el numero.
	        
	        
	        for (int i = 1; i <= (numeroFinal - numeroInicial + 1); i++ ) { //
	        																//Se suma + 1 porque ejemplo si se comienza desde 1 a 5 la diferencia es 4 
	        																//pero se evalúan 5 números, 1,2,3,4 y el 5 por eso se suma 1.
	        	
	            int divisores = 0; 					//un numero primo solo puede tener 2 divisores
	            int numeroActual = 0;
	            
	            for (int e = 1; e <= i; e++) { 		//este for por ejemplo, revisa 5 y lo divide por 1, luego 2, 3, 4 y hasta 5
	                numeroActual = e;
	                if ( (i % e) == 0){
	                	divisores++; 				//aumenta los divisores si el numero tiene un nuevo divisor	                
	                if (divisores == 2){			
	                	{break;} 					//break detiene el for
	                }
	                								//Al haber alcanzado los 2 divisores se detiene el for
	            }
	        }
	            if (numeroActual == i && i != 1){
	            	System.out.println(i); 			//Muestra el número si cumplió los requisitos
	            }
									         
									           	//En pocas palabras lo que hace ese for del e, es cancelar cuando ya se dan los dos divisores pero si
									            //Es primo se cancelará en sí mismo (3 alcanza los 2 divisores después de haberse dividido entre 3) entonces
									            //numeroActual que tomó ese valores se compara si 3 == 3 entonces es primo.
	        }
	      }
	    }
	

  
