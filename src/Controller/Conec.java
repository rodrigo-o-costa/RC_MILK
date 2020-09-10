/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Conec {
    public static Connection Conectar() throws ClassNotFoundException{
        try{
            
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rc_milk","postgres" ,"root");
        return con;
        }
        
        catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
        return null;
    }
    
    
}
