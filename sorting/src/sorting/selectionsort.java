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
public class selectionsort {
    public static void main(String[] args) {
        System.out.println("program Seaching bubblesort");
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
        
        //proses selectionsort
        
        for (int langkah = 0; langkah <data.length-1; langkah++) {
            
            int minindex=langkah;
            for (int index = langkah+1; index <data.length; index++) 
                if(data[index]<data[minindex])
                    minindex=index;
                
                if(minindex!=langkah){
                int temp=data[langkah];
                data[langkah]=data[minindex];
                data[minindex]=temp;
                }
            
            
        }
        
        //menampilkan
        for(int tampil:data){
            System.out.print(tampil+" ,");
        }
    }
}
