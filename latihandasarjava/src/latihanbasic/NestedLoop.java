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
public class NestedLoop {
    public static void main(String[] args) {
        
        for (int baris =1; baris<=3; baris++) {
            for (int kolom=1; kolom<=4; kolom++) {
                System.out.print("*");
            }
            System.out.println("");//untuk spasi antar baris saja
        }
    }
    
}
