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
public class NestedLoop3 {
    public static void main(String[] args) {
        
        for (int i =1; i <=5; i++) {
            for (int j =1; j <=5; j++) {
                if(j%2==0){
                System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
    
}
