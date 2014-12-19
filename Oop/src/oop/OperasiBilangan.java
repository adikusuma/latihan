/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import  oop1.TampilKata;

/**
 *
 * @author adi
 */
public class OperasiBilangan {
    
    public int bilangan1;
    public int bilangan2;
    private int hasil;
    
    public void jumlah(){
        this.hasil=this.bilangan1+this.bilangan2;
        
    }
    public void hasil(){
        System.out.println("hasil dari operasi bilangan adalah="+hasil);
    }
    
    public static void main(String[] args) {
        OperasiBilangan bil=new OperasiBilangan();
        bil.bilangan1=10;
        bil.bilangan2=20;
        bil.jumlah();
        bil.hasil();
        
        
        OperasiBilangan bil2=new OperasiBilangan();
        bil2.bilangan1=40;
        bil2.bilangan2=40;
        bil2.jumlah();
        bil2.hasil();
        
        TampilKata kata1=new TampilKata();
        kata1.terimakasih();
        
        
    }
}
