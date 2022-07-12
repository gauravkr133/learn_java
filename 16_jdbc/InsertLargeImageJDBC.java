import java.sql.*;
import java.io.*;

public class InsertLargeImageJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/his";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Connection closed...");
            }else{
                System.out.println("Connection created...");
            }

            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
