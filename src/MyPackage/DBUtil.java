/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Aman
 */

public class DBUtil {
   
    /**
    * Open and read a file, and return the lines in the file as a list
    * of Strings.
    * (Demonstrates Java FileReader, BufferedReader, and Java5.)
    */
    private static List<String> readFile()
    {
        List<String> records = new ArrayList<String>();
        try
        { 
            BufferedReader reader = new BufferedReader(new FileReader("server.txt"));
            String line;
            while ((line = reader.readLine()) != null)
            {
                records.add(line);
            }
            reader.close();
            return records;
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", "server.txt");
            e.printStackTrace();
            return null;
        }
    }
    private static List<String> rec = readFile();
    private static String[] rec1 = rec.toArray(new String[0]);
    private static final String DB_DRIVER_CLASS="com.mysql.jdbc.Driver";
    private static final String DB_USERNAME= rec1[1];
    private static final String DB_PASSWORD= rec1[2];
    private static final String DB_URL="jdbc:mysql://"+rec1[0]+":"+rec1[3]+"/mydb?zeroDateTimeBehavior=convertToNull";
    //private static final String DB_URL="jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull";
    //jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull
    private static Connection connection=null;
    
    static 
    {
        try
        {
            Class.forName(DB_DRIVER_CLASS);
            connection=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static Connection getConnection() throws SQLException
    {
        return connection;
    }

    static TableModel ResulSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
