/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pebri.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peb Dev
 */
public class Koneksi {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi() throws SQLException {
        if(koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/learn_java";
                String username= "root";
                String password= "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, username, password);
            } catch(SQLException e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return koneksi;
    }
}
