package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecord {
    public static void main(String[] args) {
        try{
            //taking user input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName=input.next();
            System.out.println("Enter Last Name");
            String lastName=input.next();
            System.out.println("Enter Email");
            String email=input.next();
            System.out.println("Enter Mobile Number");
            String mobile=input.next();


            Connection conn = DbConnector.connect();

            //statement
            String  sql="INSERT INTO tbl_students (first_name, last_name, email, mobile, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,firstName);
            stmt.setString(2,lastName);
            stmt.setString(3,email);
            stmt.setString(4,mobile);
            stmt.setInt(5,1);

            //execute
           int res =  stmt.executeUpdate();
            //close the connection
           conn.close();
           if(res>0){
               System.out.println("Success");
           }else{
               System.out.println("Sorry unable to Save");
           }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
