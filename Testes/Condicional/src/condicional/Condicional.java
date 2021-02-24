/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;
import java.util.Scanner;

/**
 *
 * @author Xandy
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        num1 = entrada.nextInt();
        System.out.println("Segundo numero");
        num2 = entrada.nextInt();
        entrada.close();
        
        if (num1 == num2){
            System.out.println("O Primeiro e Segundo numeros são iguais.");
        }
        else if (num1 > num2){
            System.out.println("Primeiro numero é maior que o Segundo");
        }
        else{
            System.out.println("Primeiro numero é menor que o Segundo");
        }
        
    }
    
}
