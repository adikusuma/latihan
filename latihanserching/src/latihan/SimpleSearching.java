/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;

import java.util.Scanner;

/**
 *
 * @author adi
 */
public class SimpleSearching {
    public static void main(String[] args) {
        
        System.out.println("program Seaching sederhana");
        System.out.println("==========================");
        
        System.out.println("");
        Scanner in=new Scanner(System.in);
        System.out.print("masukan jumlah data=");
        int jumlah=in.nextInt();
        
        int[] data=new int[jumlah];
        for (int i = 0; i <data.length; i++) {
            System.out.print("masukan data ke ="+i+" =");
            data[i]=in.nextInt();
            
            
        }
        System.out.println("");
        
       String jawab="y";
       
       do{
        System.out.print("masukan data yang ingin anda cari=");
        int cari=in.nextInt();
        
        System.out.println("pencarian dilakukan......");
        int indexcari=-1;
        for (int i = 0; i <data.length; i++) {
            if(data[i]==cari){
                indexcari=i;
                break;
            }
            
        }
        
        System.out.println("");
        if(indexcari != -1){
            System.out.println("data " +cari+ " ditemukan pada index ke = "+indexcari);
        }
        else{
            System.out.println("data tidak ditemukan");
        }
          
        
           System.out.print("Apakah anda ingin melakukan pencarian lagi ?");
           jawab=in.next();
           
    }
       while("y".equals(jawab));
      
      
      
   
}
}
