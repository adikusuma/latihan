/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacustomer;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author adi
 */
public class KoneksiDatabase {
    
    private static Connection koneksi;
    
    public static Connection getkoneksi(){
        if(koneksi==null){
            try{
                String url="jdbc:mysql://localhost:3306/customer";
                String user="root";
                String password="lintang";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url, user, password);
                
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "error");
            }
            
        }
        
        return koneksi;
    }
    
}
