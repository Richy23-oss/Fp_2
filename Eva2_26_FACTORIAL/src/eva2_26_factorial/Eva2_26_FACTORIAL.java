
package eva2_26_factorial;

import java.util.Scanner;


public class Eva2_26_FACTORIAL {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int num;
        long factorial = 1;
        System.out.println("introduce un termino: ");
        num = captu.nextInt();
        
        if (num < 0){
            System.out.println("factorial de numeros negativos no esta definido");
        }else{
            for(int i = 1; i <= num; i++){
                factorial = factorial * i;
            }
            System.out.println("el factorial de" + num + "es: " + factorial);
        }
    }
    
}
