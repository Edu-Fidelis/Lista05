/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista05;

import java.util.Scanner;

/**
 *
 * @author 00105049
 */
public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner t = new Scanner(System.in);
        int o = 0;
        int o1 = 0;
        int o2 = 0;

        while (o != 5) {
            System.out.println("Menu");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            o = Integer.parseInt(t.nextLine());

            switch (o) {

                case 1:
                    System.out.println("Digite um valor: ");
                    o1 = Integer.parseInt(t.nextLine());
                    System.out.println("Digite outro valor: ");
                    o2 = Integer.parseInt(t.nextLine());
                    System.out.println(c.soma(o1, o2));
                    
                    break;
                case 2:
                    System.out.println("Digite um valor: ");
                    o1 = Integer.parseInt(t.nextLine());
                    System.out.println("Digite outro valor: ");
                    o2 = Integer.parseInt(t.nextLine());
                    System.out.println(c.subtracao(o1, o2));
                    break;
                case 3:
                    System.out.println("Digite um valor: ");
                    o1 = Integer.parseInt(t.nextLine());
                    System.out.println("Digite outro valor: ");
                    o2 = Integer.parseInt(t.nextLine());
                    System.out.println(c.multiplicacao(o1, o2));
                    break;
                case 4:
                    System.out.println("Digite um valor: ");
                    o1 = Integer.parseInt(t.nextLine());
                    System.out.println("Digite outro valor: ");
                    o2 = Integer.parseInt(t.nextLine());
                    System.out.println(c.divisao(o1, o2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");
                    ;
            }
        }
    }
}
