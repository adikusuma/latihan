/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author adi
 */
public class Soal1 {
    public static void main(String[] args) {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        boolean prima;
        try{
            System.out.print("Masukan batas bawah:");
            int batas_bawah=Integer.parseInt(input.readLine());
            System.out.print("Masukan batas atas:");
            int batas_atas=Integer.parseInt(input.readLine());
            System.out.print("Genap\t:");
            for (int i =batas_bawah+1; i<batas_atas; i++) {
                if(i%2==0)
                    System.out.print(i+" ");
                
            }
            System.out.print("\nGanjil\t:");
            for (int i =batas_bawah+1; i <batas_atas; i++) {
                if(i%2!=0)
                    System.out.print(i+" ");
               
            }
            System.out.print("\nPrima\t:");
            for (int i =batas_bawah+1; i < batas_atas; i++) {
                prima=true;
                for (int j = 2; j < i; j++) {
                    if(i%j==0){
                        prima=false;
                        break;
                    }
                    else{
                        
                    }
                }
                if(prima==true)
                    System.out.print(i+" ");
            }
            
            
        }catch(IOException e){
            System.out.println("Masukan salah");
        }
    }
}

    

    