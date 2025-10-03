
package eva2_3_switch;



public class EVA2_3_SWITCH {

   
    public static void main(String[] args) {
        String cade = "Lunes";
        switch (cade){
            case "Lunes": 
                    System.out.println(1);
                    break;
            case "Martes":
                System.out.println(2);
                break;
            default:
                System.out.println("Dia no existente");
        }
        
    }
    
}
