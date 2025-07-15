/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siskrip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;
    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            String url = "jdbc:mysql://localhost:3306/db_siskrip";
            String user = "root";
            String password = ""; // Biarkan kosong jika password XAMPP root belum diatur
            conn = DriverManager.getConnection(url, user, password);
        }
        return conn;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}


