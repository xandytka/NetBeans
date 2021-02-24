/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacowhile2;
import java.util.Scanner;

/**
 *
 * @author Xandy
 */
public class LacoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome, ou s para sair");
        nome = entrada.nextLine();
        while (!nome.equals("s")){
            System.out.println("Bom dia: " + nome);
            System.out.println("Digite seu nome, ou s para sair");
            nome = entrada.nextLine();
        }
        entrada.close();
        System.out.println("Fim da execução!");
    }
    
}
