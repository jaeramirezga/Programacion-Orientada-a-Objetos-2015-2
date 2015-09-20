//Este ahorcado a sido creado y modificado por Felipe Contreras y Jaime Ramirez

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class AhorcadoJJR {
		
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
				case 4: palabra = "perro";
				break;
				case 5: palabra = "gato";
				break;
				case 6: palabra = "cocodrilo";
				break;
				case 7: palabra = "rana";
				break;
				case 8: palabra = "cabra";
				break;
				case 9: palabra = "koala";
				break;
				case 10: palabra = "raton";
				break;
				}
				
			
			char []psecreta = palabra.toCharArray();
			int aciertos=0;
			System.out.println("El tamaño de la palabra es de " + palabra.length()+" letras "+" - Tema: Animales");
			char []aux=new char[palabra.length()];
			char []mal=new char[7];
			for (int i=0;i<palabra.length();i++){
				aux[i]='_';
			}
			while(error != 7){
				for (int i=0;i<palabra.length();i++)
					
				System.out.print(aux[i]);
				System.out.print(" Ingrese una letra " + "| ");
				//error2 = error;
				if (error == 0){
					System.out.println(" ");	
					}
				else if (error == 1){
					System.out.println("d");	
					}
				else if (error == 2){
					System.out.println("d(");	
					}
				else if (error == 3){
					System.out.println("d(X");	
					}
				else if (error == 4){
					System.out.println("d(X.");	
					}
				else if (error == 5){
					System.out.println("d(X.X");	
					}
				else if (error == 6){
					System.out.println("d(X.X)");	
					}
				else if (error == 7){
					System.out.println("d(X.X)b");	
					}
				letra=t.next();
				l=letra.toCharArray()[0];
				
				if(checar(letra, palabra)){
					
					for (int i=0;i<palabra.length();i++){//Evalua si letra ingresada es correcta
						if(psecreta[i]==l)
						{
							aciertos++;
							aux[i]=l;
						}
			
					}
					for (int i=0;i<palabra.length();i++){
						if(psecreta[i]!=l)
						{
							int cont1 = 0;
							mal[cont1]=l;
							cont1++;
						}
			
					}
				}else{
					error++;
					if(error == 7){
						
						System.out.println("Perdiste!, la palabra era: "+palabra);
						System.out.println("d(X.X)b");
						break;
					}
				}
				
				if(aciertos == palabra.length()){
					System.out.println("Ganaste!, La palabra era " + palabra);				
					System.out.println(Arrays.toString(mal));
					break;
					
				}
			}
			
		}
	}