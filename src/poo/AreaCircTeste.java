/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author 00105049
 */
public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc c1 = new AreaCirc(5, 10);
        System.out.println("Resultado: " + c1.calcular());
        
        AreaCirc c2 = new AreaCirc();
//        c2.setPi(3.1415);
//        AreaCirc.pi = 3.14;
        c2.setR(100);
        System.out.println("Resultado: " + c2.calcular());
        System.out.println("Resultado: " + c1.calcular());
    }
}
