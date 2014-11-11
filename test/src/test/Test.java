/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author adi
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner in =new Scanner(System.in);
        System.out.println("masukan angka pertama= ");
        int angka1=in.nextInt();
        System.out.println("masukan angka kedua= ");
        int  angka2=in.nextInt();
        System.out.println("banyaknya perulangan =");
        int banyak=in.nextInt();
        
        System.out.println("hasil perulangan antara " +angka1+ " dan " +angka2);
        for (int i =1; i <=banyak; i++) {
            System.out.print(","+angka1);
          
        }
        for (int i = 0; i <=banyak; i++) {
            System.out.print(","+angka2);  
        }
        
        
    }
}
