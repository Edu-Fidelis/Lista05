/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista04;

/**
 *
 * @author 00105049
 */
public class Funcionario {
    private int cracha;
    private String nome;
    private char tv;
    private float vh;
    private float qh;
    private float salario;
    private float vd;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTv() {
        return tv;
    }

    public void setTv(char tv) {
        this.tv = tv;
    }

    public float getQh() {
        return qh;
    }

    public void setQh(float qh) {
        this.qh = qh;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getVd() {
        return vd;
    }

    public void setVd(float vd) {
        this.vd = vd;
    }

    public float getVh() {
        return vh;
    }

    public void setVh(float vh) {
        this.vh = vh;
    }
    
    
    
    public float calcularValorSalario() {
        if (tv == 'H') {
            return vh * qh - vd;
        } else {
            return salario - vd;
        }
    }
    
    public String imprimir(){
        return "Crachá: " + cracha + "\n" +
        "Nome: " + nome + "\n" +
        "Tipo Vínculo: " + tv + "\n" +
        "Salário: " + salario + "\n" +
        "Desconto: " + vd + "\n" +
        "Valor a receber: " + calcularValorSalario();
    }
    
}
