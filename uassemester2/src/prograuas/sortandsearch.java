/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prograuas;

import java.util.Scanner;

/**
 *
 * @author adi
 */
public class sortandsearch {
      
    
    public static void gelembung(int [] data){
       
           for (int i =0; i <data.length; i++) {
            for (int j =data.length-1; j> 0; j--) {
                if (data[j]<data[j-1]){
                    int temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                   
                }
            }
             
        }
           System.out.println("");
           for( int tampil:data){
               System.out.print(tampil+ " , ");
           }

    }
    
    public static void selectionsort(int[] data){
          for (int i=0; i < data.length- 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j <data.length; j++)
                  if (data[j] < data[minIndex])
                        minIndex = j;

            if (minIndex != i) {
                  int tmp = data[i];
                  data[i] = data[minIndex];
                  data[minIndex] = tmp;
            }            
        }
          for(int tampil:data){
              System.out.print(tampil+" , ");
          }    
    }
    
    public static void insertionsort(int[] data){
         for (int i = 1; i <data.length; i++) {
            int temp=data[i];
            
            int j=i;
            while(j>0 && data[j-1]>temp){
               data[j]=data[j-1];
               
               j--;
            }
             data[j]=temp;
        }
        for(int tampil:data){
            System.out.print(tampil+" , ");
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("PROGRAM SORTING DAN SEARCHING DATA BILANGAN");
        System.out.println("===========================================");
        System.out.println("");
        Scanner in=new Scanner(System.in);
        
        System.out.print("masukan jumlah bilangan =");
        int jumlah=in.nextInt();
        System.out.println("anda akan memasukan data "+jumlah+" data blangan dengan index  0 sampai "+(jumlah-1));
       
        
        int [] data=new int[jumlah];
       
        for (int i = 0; i <data.length; i++) {
            System.out.print("masukan bilangan dengan index ke "+i+ ":");
            data[i]=in.nextInt();
        }
        System.out.println("");
        System.out.println("Pilihan Metode Sorting");
        System.out.println("1.metode Gelembung          2.Metode Sisip     ");
        System.out.println("3.Metode Selection                             ");
        System.out.println("");
        System.out.print("Pilihan anda : ");
        int pilihan=in.nextInt();
        
        if(pilihan==1){
            System.out.println("anda memilih metode pengurutan gelembung berikut adalah hasil pengurutan data :");
            System.out.println("");
            gelembung(data);
            
        }
        else if(pilihan==2){
            System.out.println("anda memilih metode pengurutan sisip berikut adalah hasil pengurutannya :");
            System.out.println("");
            insertionsort(data);
        }
        else if(pilihan==3){
            System.out.println("anda memilih metode Selection sort, berikut adalah hasilpengurutannya :");
            System.out.println("");
            selectionsort(data);
   
            }
        
        else{
            System.out.println("Pilihan Tidak tersedia");
            
          }
        
       //menentukan nilai terbesar dan terkecil
        int terbesar=0;
        for (int k = 0; k <data.length; k++) {
            if(terbesar<data[k])
               terbesar=data[k];    
        }
        int terkecil=terbesar;
        for (int l = 0; l <data.length; l++) {
            if(terkecil>data[l])
                terkecil=data[l];   
    }
        System.out.println("\n");
        System.out.print("Data terkecil adalah : " +terkecil+ " dan data terbesar adalah:  "+terbesar);
        
        System.out.println("\n");
        System.out.println("Pilihan Metode Pencarian");
        System.out.println("1. Metode Sequensial           2.Metode Bagi Dua");
        
        System.out.println("");
        System.out.print("Pilihan anda :");
        int pilihansearch=in.nextInt();
        
        
        System.out.print("masukan data yang ingin di cari =");
        int cari=in.nextInt();
        
        
        int indexcari=-1;
        if(pilihansearch==1){
            
        System.out.println("Anda memilih metode  pencarian Sequensial untuk mencari bilangan "+cari);
        
        for (int i = 0; i <data.length; i++) {
            if(data[i]==cari){
                indexcari=i;
                break;
            }
            
        }
      
     }
        else if(pilihansearch==2){
        System.out.println("anda memilih metode Bagi dua untuk mencari bilangan "+cari);
        
        int center;
        int b=0;
        int a=data.length-1;
        
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
       
  } 
        else {
            
            System.out.println("pilihan tidaktersedia");
        }
        
        
       //menampilkan index angka yang di temukan
        if (indexcari!=-1){
               System.out.println("data anda ditemukan pada index ke= "+indexcari);
           }
        
           else{
             System.out.println("data tidak ditemukan");  
           }
        
        System.out.println("");
        System.out.println("TERIMA KASIH");
    }
}
