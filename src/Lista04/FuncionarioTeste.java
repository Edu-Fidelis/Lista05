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
public class FuncionarioTeste {
    public static void main(String[] args) {
        int op = 0;
        Funcionario f = new Funcionario();
        Scanner t = new Scanner(System.in);
        
        while(op != 4) {
            System.out.println("Menu");
            System.out.println("1 - Criar Funcionario");
            System.out.println("2 - Mostrar Folha de Pagamento");
            System.out.println("3 - Alterar Remuneração");
            System.out.println("4 - Sair");
            op = Integer.parseInt(t.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Digite o nome: ");
                    f.setNome(t.nextLine());
                    System.out.println("Digite o Cracha: ");
                    f.setCracha(Integer.parseInt(t.nextLine()));
                    System.out.println("Digite o tipo de vínculo: ");
                    f.setTv(t.nextLine().charAt(0));
                    System.out.println("Digite o valor/hora: ");
                    f.setVh(Float.parseFloat(t.nextLine()));
                    System.out.println("Digite a Qtde de horas: ");
                    f.setQh(Float.parseFloat(t.nextLine()));
                    System.out.println("Digite o salario: ");
                    f.setSalario(Float.parseFloat(t.nextLine()));
                    System.out.println("Digite o valor do desconto: ");
                    f.setVd(Float.parseFloat(t.nextLine()));
                    break;
                case 2:
                    System.out.println(f.imprimir());
                    break;
                case 3:
                    System.out.println("Digite o tipo de vínculo: ");
                    f.setTv(t.nextLine().charAt(0));
                    System.out.println("Digite o valor/hora: ");
                    f.setVh(t.nextFloat());
                    System.out.println("Digite a Qtde de horas: ");
                    f.setQh(t.nextFloat());
                    System.out.println("Digite o salario: ");
                    f.setSalario(t.nextFloat());
                    break;
                case 4:
                    System.out.println("O programa será fechado");
                    break;
                default:
                    System.out.println("Opção inválida");;
            }
        }
        
    t.close();
    }
}
