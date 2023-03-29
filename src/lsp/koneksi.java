package lsp;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi;
    
    public static Connection con() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_lsp_desktop", "root", "");
            
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
