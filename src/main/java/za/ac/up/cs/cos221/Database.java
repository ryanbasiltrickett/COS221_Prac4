/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.up.cs.cos221;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Ryan
 */
public class Database {
    private static Database instance = null;
    private Connection con = null;
    
    final String CONFIG_FILE = "app.config";
    
    private Database()
    {
        try
        {
            Properties prop = new Properties();
            try (FileReader reader = new FileReader(CONFIG_FILE))
            {
               prop.load(reader);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:" + prop.getProperty("SAKILA_DB_PROTO") + "://" + prop.getProperty("SAKILA_DB_HOST")
                         + ":" + prop.getProperty("SAKILA_DB_PORT") + "/" + prop.getProperty("SAKILA_DB_NAME");
            
            System.out.println(url);
            con = DriverManager.getConnection(url, prop.getProperty("SAKILA_DB_USERNAME"), prop.getProperty("SAKILA_DB_PASSWORD"));
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public static Database instance()
    {
        if (instance == null)
            instance = new Database();
        
        return instance;
    }
    
    protected void finalize()
    {
        try
        {
            if (con != null)
                con.close();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public Object[][] returnRows(String query)
    {
        Object[][] rows = {};
        try
        {
            Statement statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);
            
            int numCol = results.getMetaData().getColumnCount();
            int numRows = 0;
            while (results.next())
            {
                Object[] row = new Object[numCol];
                for (int i = 0; i < numCol; i++)
                    row[i] = results.getString(i + 1);
                
                Object[][] temp = rows;
                rows = new Object[++numRows][];
                System.arraycopy(temp, 0, rows, 0, numRows - 1);
                rows[numRows - 1] = row;
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
        return rows;
    }
    
    public String[] returnArray(String query)
    {
        String[] arr = {};
        try
        {
            Statement statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);
            
            int numRows = 0;
            while (results.next())
            {                
                String[] temp = arr;
                arr = new String[++numRows];
                System.arraycopy(temp, 0, arr, 0, numRows - 1);
                arr[numRows - 1] = results.getString(1);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
        return arr;
    }
    
    public void execSQL(String query)
    {
        try 
        {
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }
}
