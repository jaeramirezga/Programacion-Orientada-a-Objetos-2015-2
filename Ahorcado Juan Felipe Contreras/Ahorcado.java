import java.util.Random;
import java.util.Scanner;


public class Ahorcado {
	
	public static boolean checar(CharSequence l, String palabra){
		boolean chec;
		chec = palabra.contains(l);
		return chec;
	}

	public static void main(String[] args){
		
		Scanner t = new Scanner(System.in);
		Random ran = new Random();
		int r = ran.nextInt(10)+1;
		String palabra = "";
		int error = 0;
		String letra = "";
		char l;
		switch(r){

			case 1: palabra = "jirafa";
			break;
			case 2: palabra = "hipopotamo";
			break;
			case 3: palabra = "serpiente";
			break;
			case 4: palabra = "armadillo";
			break;
			case 5: palabra = "cucaracha";
			break;
			case 6: palabra = "cocodrilo";
			break;
			case 7: palabra = "suricato";
			break;
			case 8: palabra = "escarabajo";
			break;
			case 9: palabra = "leopardo";
			break;
			case 10: palabra = "caballo";
			break;
			}
		
		
		char []psecreta = palabra.toCharArray();
		int aciertos=0;
		System.out.println("El tamaño de la palabra es de " + palabra.length()+" letras "+" - Tema: Animales");
		char []aux=new char[palabra.length()];
		char []mal=new char[7];
		int n=0;
		
		
		for (int i=0;i<palabra.length();i++){
			aux[i]='_';
		}
		while(error != 7){										
			for (int i=0;i<palabra.length();i++)	
				
			System.out.print(aux[i]);							//Imprimimos la cantidad de espacios a llenar
			System.out.print(" Ingrese una letra " + "| ");
			System.out.print("Letras erroneas: ");
			System.out.print(mal);
			System.out.print(" | ");
		
			if (error == 0){
				System.out.println(" ");	
				}
			else if (error == 1){
				System.out.println("q");	
				}
			else if (error == 2){
				System.out.println("q(");	
				}
			else if (error == 3){
				System.out.println("q(X");	
				}
			else if (error == 4){
				System.out.println("q(X_");	
				}
			else if (error == 5){
				System.out.println("q(X_X");	
				}
			else if (error == 6){
				System.out.println("q(X_X)");	
				}
			else if (error == 7){
				System.out.println("q(X_X)p");	
				}
			letra=t.next();
			l=letra.toCharArray()[0];
			
			if(checar(letra, palabra)){
				
				for (int i=0;i<palabra.length();i++){				//Revisamos si la letra ingresada esta ubicada en algun espacio de la palabra
					if(psecreta[i]==l)
					{
						aciertos++;
						aux[i]=l;
					}
				}
				}else{
					error++;
					mal[n]=l;
					n++;
					
					if(error == 7){
						System.out.print("Perdiste!, la palabra era: "+palabra+" | ");
						System.out.println("q(X_X)p");	
						
						break;
					}
				}
				
				if(aciertos == palabra.length()){
					System.out.println("Ganaste!, La palabra era " + palabra);		
					break;
				}
		}
		
	}
}
