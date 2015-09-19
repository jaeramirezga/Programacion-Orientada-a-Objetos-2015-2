# Programaci-n-Orientada-a-Objetos-2015-2

import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {

        String l = null;
        String f = null;
        Scanner pn = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = pn.nextInt();
        System.out.println("Ingrese otro por favor: ");
        int c = sn.nextInt();
        System.out.println(n + " Es un numero: " + ParN(n, f));
        System.out.println(c + " Es un numero: " + ParC(c, f));
        System.out.println(c + " Es " + Mayor(c, n, l) + " que " + n);
        System.out.println(n+ Multiplo(c, n, l)+c);

    }

    public static String ParN(int n, String par) {
        if (n % 2 == 0) {
            par = "Par";
            return par;
        } else {
            par = "Impar";
            return par;
        }
    }

    public static String ParC(int c, String par) {
        if (c % 2 == 0) {
            par = "Par";
            return par;
        } else {
            par = "Impar";
            return par;
        }
    }

    public static String Mayor(int n, int c, String mayor) {
        if (n > c) {
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
        if(c%n==0){
            d=" Es Multiplo de: ";
            return d;
        }
        else{
            d=" No es multiplo de: ";
            return d;
        }
        
    }

}

