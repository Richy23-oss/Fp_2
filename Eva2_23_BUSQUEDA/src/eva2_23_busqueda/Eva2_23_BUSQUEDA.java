
package eva2_23_busqueda;

import java.util.Scanner;


public class Eva2_23_BUSQUEDA {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, posi = -1; //SIGNIFICA QUE NO LO ENCONTRAMOS
        int datos [] = new int [10];
        for (int i = 0; i < datos.length; i++) {
           datos [i] = (int)(Math.random()* 100);
        }
        for (int i = 0; i < datos.length; i++){
            System.out.print("[" + datos [i] + "]");
        }
        System.out.println("");
         System.out.println("valor a buscar");
          valor = captu.nextInt();
          // busqueda lineal 
          for (int i = 0; i < datos.length; i++){
              if(valor == datos [i]){// LO ENCONTRAMOS 
                  posi = i; // Regresamos donde lo encontramos 
                  break;//ya lo encontraste, detengo la busqueda 
              }
          }
          System.out.println("posiscion:" + posi);
    }
    
}
