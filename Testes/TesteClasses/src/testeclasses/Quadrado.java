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
public class Quadrado {
    private int lado_a;
    private int lado_b;
    
    public void setLado_a(int a){
        lado_a = a;
    }
    
    public void setLado_b(int b) {
        lado_b = b;
    }
    
    public int getLado_a(){
        return lado_a;
    }
    
    public int getLado_b() {
        return lado_b;
    }
    
    public void MostraArea(){
        System.out.printf("Area do quadrado com lado A = %d, e lado B = %d, é: %d", getLado_a(), getLado_b(), getLado_a() * getLado_b());
    }
    
}
