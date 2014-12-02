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
public class InputScanner {
    public static void main(String[] args) {
        
        String nama;
        Scanner in =new Scanner(System.in);
        System.out.print("Masukan nama anda=");
        nama=in.nextLine();
        
        System.out.println("Selamat datang "+nama);
        
    }
    
}
