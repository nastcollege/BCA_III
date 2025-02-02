package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ReadAllRecord {
    public static void main(String[] args) {
        try{
            Connection conn = DbConnector.connect();

            //statement
            String  sql="SELECT * FROM tbl_students";
            PreparedStatement stmt = conn.prepareStatement(sql);

            //execute
           ResultSet rs =  stmt.executeQuery();
           while(rs.next()){
               System.out.print("NAME: "+rs.getString("first_name")+ " "+rs.getString("last_name"));
               System.out.print("\tEMAIL: "+rs.getString("email"));
               System.out.print("\tMOBILE: "+rs.getString("mobile"));
               System.out.println("\tStatus: "+rs.getString("status"));

           }
            //close the connection
           conn.close();

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
