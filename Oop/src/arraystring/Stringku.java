/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystring;

/**
 *
 * @author adi
 */
public class Stringku {
    
    public String [] nama=new String[5];
    

    public void tampilstring(){
        for (int i = 0; i <nama.length; i++) {
            OperasiString os1=new OperasiString();
            System.out.println("Nama Karyawan: "+nama[i]+ "( Panjang String : "+os1.panjangstring(nama[i])+")");
        }
 
    }
}
