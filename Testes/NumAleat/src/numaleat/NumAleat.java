/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleat;
import java.util.Random;

/**
 *
 * @author Xandy
 */
public class NumAleat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio = new Random();
        int valor_inteiro = aleatorio.nextInt(10) + 1;
        float valor_decimal = aleatorio.nextFloat()*100;
        System.out.println("Número aleátorio inteiro: " + valor_inteiro);
        System.out.println("Número aleátorio decimal: " + valor_decimal);        
        
    }
    
}
