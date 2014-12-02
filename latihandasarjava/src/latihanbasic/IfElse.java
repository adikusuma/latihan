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
public class IfElse {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        System.out.println("masukan Nilai ujian anda= ");
        int nilai=in.nextInt();
        char grade;
        
        if(nilai>=90){
            grade='A';
        }
        else if(nilai>=80){
            grade='B';
        }
        else if(nilai>=70){
            grade='C';
        }
        else{
            grade='D';
        }
        
        System.out.println("Grade anda="+grade);
    }
    
}
