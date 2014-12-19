/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import oop1.TampilKata;
/**
 *
 * @author adi
 */
public class TampilHasil {
    public static void main(String[] args) {
        OperasiBilangan bilangan=new OperasiBilangan();
        bilangan.bilangan1=30;
        bilangan.bilangan2=30;
        bilangan.jumlah();
        bilangan.hasil();
        
        TampilKata kata=new TampilKata();
        kata.tampil();
    }
}
