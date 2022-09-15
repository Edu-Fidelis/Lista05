/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista04;

import java.util.Scanner;

/**
 *
 * @author 00105049
 */
public class PessoaTeste {
    public static void main(String[] args) {
        int op = 0;
        Scanner t = new Scanner(System.in);
        Pessoa p = new Pessoa();
        
        while(op != 3) {
            System.out.println("Menu");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Mostrar Pessoa");
            System.out.println("3 - Sair");
            op = t.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome: ");
                    p.setNome(t.nextLine());
                    System.out.println("\nDigite o CPF: ");
                    p.setCpf(t.nextLine());
                    System.out.println("Digite o sexo: ");
                    p.setSexo(t.nextLine().charAt(0));
                    System.out.println("Digite a idade: ");
                    p.setIdade(t.nextInt());
                    break;
                case 2:
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O programa será fechado");
                    break;
                default:
                    System.out.println("Opção inválida");;
            }
        }
        
    t.close();
    
    }
}
