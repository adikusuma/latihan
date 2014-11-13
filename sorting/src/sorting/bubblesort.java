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
public class bubblesort {
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
        //proses bublesort
        for (int i = 0; i <data.length; i++) {
            for (int j = 0; j <data.length-1; j++) {
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
                
            }
            
        }
        
        System.out.println("tampilan=");
        for(int tampil: data)
            System.out.print(tampil+" ,");
    }
    
}
