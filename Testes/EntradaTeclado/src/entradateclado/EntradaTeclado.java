/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradateclado;
import java.util.Scanner;
/**
 *
 * @author Xandy
 */
public class EntradaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = texto.nextLine();
        System.out.println("Bom dia " + nome);
        System.err.println("Digite sua idade: ");
        idade = texto.nextInt();
        System.err.println("Sua idade é: " + idade);
        
        texto.close();
    }
    
}
