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
public class NestedLoopBentukSegitiga {
    public static void main(String[] args) {
        
        for (int tinggi = 1; tinggi <=5; tinggi++) {
            for (int alas =1; alas <=tinggi; alas++) {
                System.out.print("*");
                
            }
            System.out.println("");//untuk spasi saja
        }
    }
    
}
