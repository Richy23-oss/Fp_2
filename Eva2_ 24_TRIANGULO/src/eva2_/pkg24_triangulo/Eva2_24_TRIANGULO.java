
package eva2_.pkg24_triangulo;

import java.util.Scanner;


public class Eva2_24_TRIANGULO {

    
    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
      int n;
      System.out.println("introduce un valor");
      n = captu.nextInt();
      
      for (int i = 1; i <=n; i++){
          for (int e = 1; e <= i; e++){
              System.out.print("*");
          }
          System.out.println("");
      }
      System.out.println("");
     for (int x = 1; x <= 29; x++){
         System.out.print("+");
     }
    }
    
}
