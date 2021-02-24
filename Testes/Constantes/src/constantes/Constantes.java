/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantes;
import java.util.Scanner;

/**
 *
 * @author Xandy
 */
public class Constantes {
    public static final int DDD_AREA = 11;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num_tele;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu numero de telefone: ");
        num_tele = teclado.nextInt();
        System.out.println("Seu numero de telefone com codigo de area é: " + DDD_AREA + " " + num_tele);
      
        
    }
    
}
