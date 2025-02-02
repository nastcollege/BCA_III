package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;

//imports
public class DbConnector {
    public static void main(String[] args) {
        try{
            DbConnector.connect();


        }catch (Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }

    public static Connection connect() throws Exception{
        //driver load
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded...");

        //database connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_bca_iii_g1",
                "root","");
        System.out.println("Database connection success");
        return con;
    }
}
