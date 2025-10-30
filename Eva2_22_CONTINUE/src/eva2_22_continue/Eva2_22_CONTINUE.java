
package eva2_22_continue;


public class Eva2_22_CONTINUE {

   
    public static void main(String[] args) {
        //imprimir numeros pares
        int i = 0;
        while (i < 100){
            int resi = i % 2; 
            if (resi != 0)//divisible entre 2 
            i++;
            continue; //Interrumpe la repeticion actual
            }
            System.out.print(i + " - ");
            i++;
        }
    }
    

