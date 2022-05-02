package za.ac.up.cs.cos221;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class Database {
    private static Database instance = null;
    private Connection con = null;
    
    final String CONFIG_FILE = "app.config";
    
    private Database()
    {
        try
        {
            // use config file
            Properties prop = new Properties();
            try (FileReader reader = new FileReader(CONFIG_FILE))
            {
               prop.load(reader);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            // connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:" + prop.getProperty("SAKILA_DB_PROTO") + "://" + prop.getProperty("SAKILA_DB_HOST")
                         + ":" + prop.getProperty("SAKILA_DB_PORT") + "/" + prop.getProperty("SAKILA_DB_NAME");
            
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
    
    // Destructor
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
    
    // Returns tuples
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
    
    // Returns first column as a sing array
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
    
    // Executes SQL statements
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
