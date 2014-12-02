/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbasic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author adi
 */
public class FormatNumber {
    public static void main(String[] args) {
         int bil1,bil2,hasil,pilihan;
         
        String kembali="y"; 
        while("y".equals(kembali)){
        
        DecimalFormat formatku=new DecimalFormat("0.00");
        Scanner input=new Scanner(System.in);
        System.out.print("masukan nilai pertama=");
        bil1=input.nextInt();
        System.out.print("masukan bilangan kedua=");
        bil2=input.nextInt();
        
        
        System.out.println("========================================");
        System.out.println("Pilihan Operasi matematika yang tersedia");
        System.out.println("1.Tambah                   2.Kurang");
        System.out.println("3.Kali                     4.bagi  ");
        System.out.print("Silahkan Memasukan Pilihan Operasi matematika=");
        pilihan=input.nextInt();
        System.out.println("============================================");
        
        if (pilihan==1){
            System.out.println("Piliihan operasi yang anda pilih= Tambah");
            hasil=bil1+bil2;
            System.out.println("Hasil penjumlahan"+bil1+" dan"+bil2+" ="+hasil);
        }
        else if (pilihan==2){
        System.out.println("Piliihan operasi yang anda pilih= Kurang");
            hasil=bil1-bil2;
            System.out.println("Hasil pengurangan"+bil1+" dan"+bil2+" ="+hasil);
        }
        else if (pilihan==3){
            System.out.println("Piliihan operasi yang anda pilih= kali");
            hasil=bil1*bil2;
            System.out.println("Hasil perkalian"+bil1+" dan"+bil2+" ="+hasil);
        }
        else{
            System.out.println("Piliihan operasi yang anda pilih= Bagi");
            double hasilbagi=(double)(bil1)/bil2;
            System.out.println("Hasil pembagian"+bil1+" dan"+bil2+" ="+formatku.format(hasilbagi));
        }
        
        
        System.out.println("apakah anda ingin melakuan proses lagi?");
        kembali=input.next();
                }
    }
    
}
