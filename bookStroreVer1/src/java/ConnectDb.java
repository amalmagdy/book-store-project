/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karim
 */
public class ConnectDb {

  
    private final String schemaName="jdbc:mysql://localhost:3307/chatdb5";
    private final String username = "amal";
    private final String password = "1234";

    public String getSchemaName() {
        return schemaName;
    }

    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public  Statement getStatment(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection con=  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/jets" , "root" ,"1234");
            java.sql.Connection con = DriverManager.getConnection(getSchemaName() ,getUsername(),getPassword());
            
            Statement stmt=(Statement) con.createStatement();
            return stmt;
        } catch (SQLException ex) {
            System.out.println("erooooooooooooooooooooor  in db");
return null;        }
    }
    
    
    public boolean signIn(String userName,String password)
    {
      /////code here
        return true;
    }
}
