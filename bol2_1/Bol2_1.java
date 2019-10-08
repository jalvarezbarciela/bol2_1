package bol2_1;

import java.util.Scanner;


public class Bol2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cal e a tarifa?");
        float ptarifa= sc.nextFloat();
        System.out.println("Cal e o prezo pagado?");
        float ppagado= sc.nextFloat();
        float pordescuento= (100-(ppagado*100)/ptarifa);
        System.out.println("O porcentaxe e do"+pordescuento+"%");
    }
    
}
