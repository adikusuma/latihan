/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbasic;

import java.util.Scanner;

/**
 *
 * @author adi
 */
public class SwitchCase {
    public static void main(String[] args) {
        
        
        System.out.println("=================================");
        System.out.println("       Daftar Menu Masakan       ");
        System.out.println("=================================");
        System.out.println("");
        System.out.println("1.Soto Ayam        2.Soto kambing");
        System.out.println("3.Nasi Goreng      4.Gule Kambing");
        
        Scanner in=new Scanner(System.in);
        System.out.println("Daftar Masakan yang anda Pilih[1-4] =");
        int pilihan=in.nextInt();
        
       switch(pilihan){
           
           case 1:
               System.out.println("anda memilih soto ayam");
               System.out.println("pesanan sedang di proses");
               break;
           case 2:
               System.out.println("anda memilih soto kambing");
               System.out.println("pesanan sedang di proses");
               break;
           case 3:
               System.out.println("anda memilih Nasi Goreng");
               System.out.println("pesanan sedang di proses");
               break;   
           case 4:
               System.out.println("anda memilih Gule kambing");
               System.out.println("pesanan sedang di proses");
               break;
               
           default:
               System.out.println("pilihan tidak tersedia");
                   
       }
    }
    
}
