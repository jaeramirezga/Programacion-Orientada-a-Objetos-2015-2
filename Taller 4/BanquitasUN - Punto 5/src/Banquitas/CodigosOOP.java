/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banquitas;

import java.io.*;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Estudiante
 */
public class CodigosOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        System.setIn( new FileInputStream(new File("input.txt")) );
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while( sc.hasNext() ){
            int numero = sc.nextInt();
            suma+=numero;
            System.out.println("String Leido: "+sc.next());
            System.out.println("Numero Leido: "+ numero);
            System.out.println("Suma: "+suma);
            if( suma>10000)
                break;
        }
    }
    
}
