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
public class Decrement2 {
    public static void main(String[] args) {
        
        int w,x,y,z;
        
        x=5;
        w=5;
        
        y=8-x--;
        z=8- --w;
        
        System.out.println("Nilai x="+x);
        System.out.println("Nilai w="+w);
        System.out.println("Nilai y="+y);
        System.out.println("Nilai z="+z);
    }
    
}
