/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author riard
 */
public class Eva2_11_FOR {

    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int ini, fin, resi;
        System.out.println("inicio");
        ini = captu.nextInt();
        System.out.println("fin");
        fin = captu.nextInt();
        for(int i = ini; i <= fin; i++){
            resi = i % 2; //saber si es par 
            if(resi == 0)//es par
                System.out.print(i + "-");
        {}}
    }
}
