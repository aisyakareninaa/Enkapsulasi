/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum;

/**
 *
 * @author Panda PC
 */
public class Bus_Praktikum {
    private int penumpang, maxPenumpang, counter, penumpangBaru;
    //kontruktor
    public Bus_Praktikum (int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void plusPenumpang (int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang){
            System.out.println("Overload Penumpang");
        } else {
            this.penumpang = temp;
        }
    }
    public void getAverage(){
        if (penumpang <= maxPenumpang){
            System.out.println("Muatan cukup");
        } else {
            System.out.println("Muatan berlebih");
        }
    }
    public void getPassword(int password){
        if (password ==90){
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }
    public void cetak(){
        System.out.println("jumlah penumpang sekarang = " + penumpang);
        System.out.println("jumlah penumpang searusnya adalah = " + maxPenumpang);
    }
}
