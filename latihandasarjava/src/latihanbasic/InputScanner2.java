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
public class InputScanner2 {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Masukan bilangan 1=");
        double alas=in.nextDouble();
        System.out.println("masukan bilangan 2=");
        double tinggi=in.nextDouble();
        
        double luassegitiga=(alas*tinggi)/2;
        System.out.println("Luas segitiga="+luassegitiga);
    }
    
}
