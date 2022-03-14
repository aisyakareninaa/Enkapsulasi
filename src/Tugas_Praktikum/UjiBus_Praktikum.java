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
public class UjiBus_Praktikum {
    public static void main (String[] args){
        Bus_Praktikum busMini = new Bus_Praktikum(13);
        busMini.getPassword(90);
        busMini.getAverage();
        busMini.cetak();
        
        busMini.plusPenumpang(3);
        busMini.cetak();
        
        busMini.plusPenumpang(1);
        busMini.cetak();
        
        busMini.plusPenumpang(1);
        busMini.cetak();
    }
}
