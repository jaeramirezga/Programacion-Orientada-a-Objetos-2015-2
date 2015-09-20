import java.util.Scanner;

//Spaces:
//Escriba un programa que lea un numero enteros, separe el numero en sus digitos, 
//e imprima cada digito separado uno de otro por 3 espacios.
//[Ayuda: use el operador modulo; la funcion potencia en java es
//Math.pow(double a, double b) y retorna ab] Por ejemplo si el usuario ingresa 
//42339 el programa debe imprimir:
//4   2   3   3   9

public class PointB {
    
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);  //crear un objeto Scanner
        
        long numero=0 ; // nombre de la variable 
        long[] numeroseparado ;
       
        while(numero==0){
            try{
                System.out.println("Por favor ingrese un numero:");
                numero= Long.parseLong(entrada.next());
            
            }catch(Exception TypeMismatchException){
                System.out.println("ERROR INGRESAR NUMEROS");
            }
        }
        
        numeroseparado = new long[(int)Math.log10(numero)+1];
        int modulo=10,posicion=0;
        
        
        //primero le saco el modulo al numero y se guarda el digito -nota: imprimir alrevez 
        //despues se resta el modolo del numero
        // se aumenta el modulo en 10
        // se aumenta la posicion del diguito
         
       do{
        numeroseparado[posicion] = numero%modulo/(modulo/10);
        numero-=numero%modulo;
        modulo*=10;
        posicion++;
       }while(numero>0);
        
       
        for(int j = posicion-1; j>=0 ;j--){
        System.out.print(numeroseparado[j]+ "  ");
        }
        System.out.println();
    }
} 

