/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistlatihan;

import java.util.ArrayList;

/**
 *
 * @author adi
 */
public class latihanArraylist {
    public static void main(String[] args) { 
        ArrayList<String> mahasiswa=new ArrayList();
        System.out.println("Data sebelum diinput=");
        
        mahasiswa.add("adi");
        mahasiswa.add("ida");
        mahasiswa.add("kusuma"); 
        mahasiswa.add("uda");
        mahasiswa.add("odi");
        
        for (String data:mahasiswa) {
            System.out.println(data);
        }
        mahasiswa.add(5,"ucil");
        
        System.out.println("");
        System.out.println("data setelah di tambah ucil di akhir");
        for(String data1:mahasiswa){
        System.out.println(data1);
        }
        mahasiswa.add(1,"ucup");
        mahasiswa.add(4,"udin");
        
        System.out.println("");
        System.out.println("data setelah di tambah ucup di 1 dan udin di 4");
        for(String data2:mahasiswa){
            System.out.println(data2);
        }
      
        mahasiswa.set(3, "ucok baba");
        System.out.println("");
        System.out.println("data setelah index 3 diganti ucok baba");
        for(String data3:mahasiswa){
            System.out.println(data3);
        }
        
        String ambil=mahasiswa.get(2);
        System.out.println("");
        System.out.println("mengambil data dari index 2= "+ambil);
        
        System.out.println("");
        mahasiswa.remove(1);
        System.out.println("data setelah di remove index 1");
        for(String data4:mahasiswa){
            System.out.println(data4);
        }
        }
    
       
    }

