/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDB(){
    
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\renzl\\Documents\\NetBeansProjects\\Database\\TheShop.sqlite");
        //JOptionPane.showMessageDialog(null, "Connection Established");
        return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
        
    }
}
