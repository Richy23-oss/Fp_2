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
        //capturar
        System.out.println("cauntas calificacionjes va a capturar?");
        tama=captu.nextInt();
        int califas[] = new int [tama];
        for(int i = 0; i< califas.length; i++){
            System.out.println("calificacion" + (i+1) + ":");
            califas[i]= captu.nextInt();
        }
        //leer
        for(int i = 0; i< califas.length; i++){
            System.out.println("[" + califas[i] + "]");
        }
        int suma = 0;
        //SUMAR TODAS LAS CALIFICACIONES
        for(int i = 0; i< califas.length; i++){
            suma = suma + califas[i];
            //suma += califas[i]
        }
        double promedio + suma / tama; 
        System.out.println("promedio = "+ promedio);
        
    }
}
