package eva2_6_arreglos_string_2;

import java.util.Scanner;

public class EVA2_6_ARREGLOS_STRING_2 {

    public static void main(String[] args) {
        Scanner captu =new Scanner (System.in);
        int dia;
        String diasSemana[] = {"domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes",  "sabado"};
        System.out.println("introduce el dia en numero (0-6):");
        dia=captu.nextInt();
        System.out.println("el dia es" + diasSemana[dia]);
    }
    
}
