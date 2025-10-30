/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;

import java.util.Scanner;

/**
 *
 * @author rosal
 */
public class Eva2_21_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor, adivinar;
        adivinar = (int)(Math.random()* 5) + 1; // entre 1 y 5
        while (true){
            System.out.println("adivina el numero. -1 para terminar");
            valor = captu.nextInt();
            if (valor == adivinar){
                System.out.println("Felicidades, adivinaste");
                break;
            }
            if (valor == -1)
                break; // TERMINA POR COMPLETO EL CICLO
        }
        System.out.println("Gracias por jugar");
    }
    
}
