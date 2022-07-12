import java.sql.*;
import java.io.*;

public class InsertImageJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/his";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            if(con.isClosed()){
                System.out.println("Connection error...");
            }else{
                System.out.println("Connection Created...");
            }
            String query = "INSERT INTO images(image) VALUES(?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            FileInputStream fis = new FileInputStream("koo.png");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("Image uploaded successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
