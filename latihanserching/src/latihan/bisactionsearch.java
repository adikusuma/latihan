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
public class bisactionsearch {
    public static void main(String[] args) {
        System.out.println("Program searching dengan bisaction ");
        System.out.println("===================================");
        
        Scanner in=new Scanner(System.in);
        System.out.print("masukan jumlah data=");
        int jumlah=in.nextInt();
       
        int[] data=new int[jumlah];
        for (int i = 0; i <data.length; i++) {
            System.out.print("masukan data pada index "+i+ "=");
            data[i]=in.nextInt();
            
        }
        //urutkan data
        for (int i = 0; i <data.length-1; i++) {
            int index=i;
            for (int j = i+1; j <data.length; j++) {
                if(data[j]<data[index])
                    index=j;
                    
                
                int min=data[i];
                data[i]=data[index];
                data[index]=min;
            }
            
        }
        System.out.print("masukan data yang ingin anda cari=");
        int cari=in.nextInt();
        
        int center;
        int b=0;
        int a=data.length-1;
        int indexcari=-1;
        
       while(a>=b){
           center=(a+b)/2;
           
           if (data[center]==cari){
               indexcari=center;
               break;
               
           }
           else if (data[center]>cari){
               a=center-1;
           }
           else{
             b=center+1;  
           }  
       }
       if (indexcari==-1){
               System.out.println("data tidak ditemukan");
               
           }
           else{
               System.out.println("data "+cari+ " ditemukan pada index ke= "+indexcari);
           }
    }
    
}
