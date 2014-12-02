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
public class Substring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukan nama anda=");
        String nama=in.nextLine();
      
        System.out.print("berapa karakter nama belakang anda=");
        int belakang=in.nextInt();
        
        int jumlahkar=nama.length();
        int awal=jumlahkar-belakang;//menentukan nilai karakter awal huruf belakang
        String sub=nama.substring(awal,jumlahkar);
        
        System.out.println("Jadi nama belakang anda="+sub);
    }
    
}
