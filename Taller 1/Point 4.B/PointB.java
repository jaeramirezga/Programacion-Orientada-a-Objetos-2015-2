import java.util.Scanner;

public class PointB {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
    
        long numero=0 ;
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
