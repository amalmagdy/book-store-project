/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Karim
 */
public class ConnectDb {

    private final String schemaName = "jdbc:mysql://localhost:3307/bookStore";
    private final String username = "root";
    private final String password = "1234";
    private userBean user = null;

    public String getSchemaName() {
        return schemaName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Statement getStatment() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection con=  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/jets" , "root" ,"1234");
            java.sql.Connection con = DriverManager.getConnection(getSchemaName(), getUsername(), getPassword());

            Statement stmt = (Statement) con.createStatement();
            return stmt;
        } catch (SQLException ex) {
            System.out.println("erooooooooooooooooooor  in db");
            return null;
        }
    }

    public userBean signIn(String email, String password) {
        user = null;
        try {
          
            Statement stmt = getStatment();
            ResultSet rs = stmt.executeQuery(" SELECT * FROM user where email = '" + email + "' and password ='" + password + "'");
            if (rs.next()) {
                user = new userBean();
                user.setEmail(rs.getString(1));
                user.setFirstname(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setJob(rs.getString(5));
                user.setBirthday(rs.getString(6));
                user.setAddress(rs.getString(7));
                user.setCreditBalance(rs.getInt(8));

            }

        } catch (Exception ee) {
            System.out.println("errrrrrrrrrrrrrrrrrror in db sign in ");

        }
        return user;
    }

    public userBean getUser() {
        return user;
    }

    //sign up method 
    public boolean signUp(userBean user) {
        String email = user.getEmail();
        String first = user.getFirstname();
        String last = user.getLastname();

        String pass = user.getPassword();
        String job = user.getJab();
        String birthDay = user.getBirthday();
        String address = user.getAddress();
        int credit = user.getCreditBalance();

    

            try {
               // ConnectDb con = new ConnectDb();
                Statement stmt = getStatment();
                stmt.executeUpdate(" insert into user(email ,firstName ,lastName ,password,job ,birthday ,address ,creditBalance ) values ('" + email + "' ,'" + first + "','" + last + "' ,'" + pass + "' ,'" + job + "' ,'" + birthDay + "' ,'" + address + "' ," + credit + ")");
                return true;
            } catch (Exception e) {
                System.out.println("insert errrrrrrrrrrrror");
                return false;
            }
        }
///////// end ofsign up method
}
