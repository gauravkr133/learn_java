import java.sql.*;
public class MysqlConnection_jdbc{
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/his";
            String username = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Connection is closed.");
            }else{
                System.out.println("Connection Created.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}