import java.sql.*;
import java.io.*;
public class InsertDataJDBC {
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
                    System.out.println("Connection Open...");
                }
    
                String query = "INSERT INTO table1(tName,tCity) VALUES(?,?)";
                PreparedStatement pstmt =  con.prepareStatement(query);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the name: ");
                String name = br.readLine();
                System.out.println("Enter the city: ");
                String city = br.readLine();
                pstmt.setString(1, name);
                pstmt.setString(2, city);
                pstmt.executeUpdate();
                System.out.println("Value inserted successfully");
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
