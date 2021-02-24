/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeclasses;

/**
 *
 * @author Xandy
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado caixa = new Quadrado();
        int aa = 4;
        int bb = 3;
        
        caixa.setLado_a(aa);
        caixa.setLado_b(bb);
        caixa.MostraArea();
    }
    
}
