/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aman
 */
public class Createadminpassword {
    public static void main(String ar[])
    {
        String adminname="shreyash1212";
        String password="shreyash1212";
        String hash=encryptPass.encrypt(password);
        try 
        {
            Connection con=DBUtil.getConnection();
            PreparedStatement pr=con.prepareStatement("insert into admins values(null,'"+adminname+"','"+hash+"')");
            pr.execute();
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.print(e);
        }
    }
}
