/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_for_arreglos;

/**
 *
 * @author riard
 */
public class Eva2_13_FOR_ARREGLOS {

    public static void main(String[] args) {
        int arreglo[] = new int [10];
        /*arrelgo[0] = 100;
        arrelgo[1] = 200;
        arrelgo[2] = 300;
        arrelgo[3] = 400;
        arrelgo[4] = 500;
        arrelgo[5] = 600;
        arrelgo[6] = 700;
        arrelgo[7] = 800;
        arrelgo[8] = 900;
        arrelgo[9] = 1000;*/
        //ASIGNAR VALORES
        for (int i = 0; i < arreglo.length; i++){
            arreglo [i] = (int)(Math.random() * 100); //casting
        }
        //LEER VALORES
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("[" + arreglo[i] + "]");
        }
    }
}
