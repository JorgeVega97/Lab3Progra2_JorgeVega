/*
Clase main del BOTS
 */
package bots_jorgevega_11941147;
import java.util.Scanner;
/**
Jorge Vega
 */
public class BOTS_JorgeVega_11941147 {
    
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE PESO: ");
        double peso = sc.nextDouble();
        System.out.println("INGRESE ESTADO ACTUAL: ");
        int estado = sc.nextInt();
        System.out.println(new Unidad_Cerebral(estado,peso));
        
    }
    
}
