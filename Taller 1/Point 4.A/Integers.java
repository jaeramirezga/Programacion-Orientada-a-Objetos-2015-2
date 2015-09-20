
import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {

        String l = null;	//Creamos las variables.
        String f = null;
        Scanner pn = new Scanner(System.in);	// Usamos el Scanner para leer los 2 numeros a comparar.
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = pn.nextInt();
        System.out.println("Ingrese otro por favor: ");
        int c = sn.nextInt();
        System.out.println(n + " Es un numero: " + ParN(n, f));				//Las salidas con sus respectivas funciones, para que impriman
        System.out.println(c + " Es un numero: " + ParC(c, f));				// lo indicado de cada una.
        System.out.println(c + " Es " + Mayor(c, n, l) + " que " + n);
        System.out.println(n+ Multiplo(c, n, l)+c);

    }

    public static String ParN(int n, String par) {
        if (n % 2 == 0) {	//Usamos este if para revisar si N es Par;
            par = "Par";
            return par;
        } else {
            par = "Impar";
            return par;
        }
    }

    public static String ParC(int c, String par) {
        if (c % 2 == 0) {  //Usamos este if para revisar si N es Par;
            par = "Par";
            return par;
        } else {
            par = "Impar";
            return par;
        }
    }

    public static String Mayor(int n, int c, String mayor) {
        if (n > c) {          //Comparamos N con C;
            mayor = "Mayor";
            return mayor;
        } else if (c > n) {
            mayor = "Menor";
            return mayor;
        } else {
            mayor = "Igual";
            return mayor;
        }
    }
    public static String Multiplo(int n,int c,String d){
        if(c%n==0){					//Revisamos si es multiplo N de C por medio del modulo
            d=" Es Multiplo de: ";
            return d;
        }
        else{
            d=" No es multiplo de: ";
            return d;
        }
        
    }

}
