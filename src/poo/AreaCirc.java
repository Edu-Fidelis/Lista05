package poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 00105049
 */
public class AreaCirc {
    public final static double pi  = 3.1415;
    private double r;

    public AreaCirc(double pi, double r) {
//        this.pi = pi;
        this.r = r;
    }
    
    public AreaCirc() {
        
    }
    
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
//        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double calcular() {
        return pi * r * r;
    }
}
