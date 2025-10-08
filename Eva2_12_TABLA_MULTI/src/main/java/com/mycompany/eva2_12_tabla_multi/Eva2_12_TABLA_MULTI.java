/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author riard
 */
public class Eva2_12_TABLA_MULTI {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int num;
        
        System.out.println("ingresa un numero");
        num = captu.nextInt();
        for(int i = 1; i <= 10; i++)
            System.out.println(num + "x" + i + "=" + (num*i));
    }
}
