/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sayapesan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Angiospermae
 */
public class loginDB {
    @SuppressWarnings("UseSpecificCatch")
    private boolean validate(String username, String password) throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbpboa?" + "user=root&password=");
            PreparedStatement pst = conn.prepareStatement("Select * from login where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        }
        catch(Exception e){
            return false;
        }
    }
}
