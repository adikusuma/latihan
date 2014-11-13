/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import java.util.Scanner;

/**
 *
 * @author adi
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("program sorting dengan bubble sort");
        System.out.println("==================================");
        
        Scanner in=new Scanner(System.in);
        System.out.println("masukan banyak data=");
        int jumlah=in.nextInt();
        
        int[]angka=new int[jumlah];
        for (int i = 0; i <angka.length; i++) {
            System.out.println("masukan angka ke-"+(i+1)+"=");
            angka[i]=in.nextInt();
        }
        //menampilkan data sebelum di sorting
        System.out.println("data sebelum di sorting");
        for (int i = 0; i <angka.length; i++) {
            System.out.print(angka[i]+",");
            
        }
        System.out.println("");
        
        urutdata(angka);
        
        
    }
    public static void urutdata(int[] angka){
        for (int i =0; i <angka.length-1; i++) {
            for (int j =angka.length-1; j> 0; j--) {
                if (angka[j]<angka[j-1]){
                    int temp=angka[j];
                    angka[j]=angka[j-1];
                    angka[j-1]=temp;
                }
                
            }
             
        }
        System.out.println("");
        System.out.println("data setelah diurutkan=");
        for(int tampil2:angka){
            System.out.print(tampil2+",");
        }
    
    }
}
 
