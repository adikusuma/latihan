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
public class JumlahHari {
    public static void main(String[] args) {
        
        System.out.println("Program Menghitung Jumlah Hari");
        System.out.println("==============================");
        Scanner in=new Scanner(System.in);
        System.out.println("Masukan tahun= ");
        int tahun=in.nextInt();
        System.out.println("Masukan Bulan= ");
        int bulan=in.nextInt();
        int hari=0;
        switch(bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                hari=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                hari=30;
                break;
            case 2:
                if( ((tahun%4==0)  && (tahun%100 !=0))|| (tahun%400==0)){
                    hari=29;
                }
                else{
                    hari=28;
                }
            break;
            default:
                System.out.println("invalid");
        }
        System.out.println("jumlah hari pada tahun " +tahun+ " dan bulan " +bulan+ " = " +hari);
    }
    
}
