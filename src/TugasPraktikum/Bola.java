/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Panda PC
 */
public class Bola {
    private double jari, phi, D, LP, V;

    public Bola(){
        phi = 3.14;
        jari = 0;
        D = 0;
        LP = 0;
        V = 0;
    }

    public void setJari(double inputr){
        double temp;
        temp=this.jari+inputr;
        this.jari = temp;
        System.out.println("Jari-jari : " + jari);
    }

    public void showD(){
        D = 2*jari;
        System.out.println("Diameter : " + D);
    }

    public void showLP(){
        LP = 4*phi*Math.pow(jari,2);
        System.out.println("Luas Permukaan Bola.Bola : " + LP);
    }

    public void showV(){
        V = (4*phi*Math.pow(jari,3))/3;
        System.out.println("Volume Bola.Bola : " + V);
    }
}
