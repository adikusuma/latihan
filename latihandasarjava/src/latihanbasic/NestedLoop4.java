/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbasic;

/**
 *
 * @author adi
 */
public class NestedLoop4 {
    public static void main(String[] args) {
        
        for (int i =1; i <=3; i++) {
            for (int j =1; j <=5; j++) {
                if((i+j)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");//mencetak kosong jika pertambahan i dan j tidak habis di bagi 2
                }
            }
            System.out.println("");
        }
    }
    
}
