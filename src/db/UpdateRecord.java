package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateRecord {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Id");
            int studentId=input.nextInt();

            Connection conn = DbConnector.connect();

            //statement
            String  sql="SELECT * FROM tbl_students WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,studentId);

            //execute
            ResultSet rs =  stmt.executeQuery();
            while(rs.next()){
                System.out.print("NAME: "+rs.getString("first_name")+ " "+rs.getString("last_name"));
                System.out.print("\tEMAIL: "+rs.getString("email"));
                System.out.print("\tMOBILE: "+rs.getString("mobile"));
                System.out.println("\tStatus: "+rs.getString("status"));

            }

            //taking user input

            System.out.println("Enter First Name");
            String firstName=input.next();
            System.out.println("Enter Last Name");
            String lastName=input.next();
            System.out.println("Enter Email");
            String email=input.next();
            System.out.println("Enter Mobile Number");
            String mobile=input.next();

            input.close();
            //statement
            String  sql2="UPDATE tbl_students SET first_name=?, last_name=?, email=?, mobile=?, status=? WHERE id=?";
            PreparedStatement stmt2 = conn.prepareStatement(sql2);
            stmt2.setString(1,firstName);
            stmt2.setString(2,lastName);
            stmt2.setString(3,email);
            stmt2.setString(4,mobile);
            stmt2.setInt(5,1);
            stmt2.setInt(6,studentId);


            //execute
           int res =  stmt2.executeUpdate();
            //close the connection
           conn.close();
           if(res>0){
               System.out.println("Update Success");
           }else{
               System.out.println("Sorry unable to Save");
           }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
