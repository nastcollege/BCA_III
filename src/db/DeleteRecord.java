package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Id");
            int studentId=input.nextInt();


            Connection conn = DbConnector.connect();

            //statement
            String  sql="DELETE FROM tbl_students WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,studentId);

            //execute
           int res =  stmt.executeUpdate();
            //close the connection
           conn.close();
           if(res>0){
               System.out.println("Delete Success");
           }else{
               System.out.println("Sorry unable to delete");
           }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
