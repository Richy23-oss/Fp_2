
package eva2_5_arreglo_string;

import java.util.Scanner;


public class EVA2_5_ARREGLO_STRING {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int dia;
       String diasSemana[] = new String[7];
       diasSemana[0] = "Domingo";
       diasSemana[1] = "Lunes";
       diasSemana[2] = "Martes";
       diasSemana[3] = "Miercoles";
       diasSemana[4] = "Jueves";
       diasSemana[5] = "Viernes";
       diasSemana[6] = "Sabado";
       System.out.println("Introduce el dia en numero (0-6):");
       dia = captu.nextInt();
       System.out.println("El dia es" + diasSemana[dia]);
       



    }
    
}
