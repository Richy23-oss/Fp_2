/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author riard
 */
public class Eva2_14_CAPTURA {

    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
       int tama; 
       System.out.println("cuantas calificaciones necesitas:");
       tama = captu.nextInt();
       
       int califas [] = new int [tama];
       //capturar 
       for (int i =0; i < califas.length; i++){
           System.out.println("calificacion: " + (i+1) + ":");
           califas [i]= captu.nextInt();
           
       }
       for (int i = 0; i < califas.length; i++){
           System.out.println("[" + califas [i] + "]");
    }
    }   
}
