/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbasic;

import java.text.DecimalFormat;


/**
 *
 * @author adi
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        
        double jari=11.75;
        double luas;
        Lingkaran l1 =new Lingkaran();
        luas=Math.PI*jari*jari;
        
        DecimalFormat formatku=new DecimalFormat("0.00");
        System.out.println("luas lingkaran="+l1.hitungluas(jari));
        System.out.println("Luas lingkaran dalam bentuk decimal 2 angka dibelakang koma ="+formatku.format(luas));
        System.out.println("luas lingkaran dalam bilangan bulat="+(int)luas);
        System.out.println("luas lingkaran dalam bentuk pembulatan="+Math.round(luas));
       
        
        
        
    }
    
}
