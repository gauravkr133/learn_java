import java.sql.*;
public class CreateTableJDBC {
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

            String query = "CREATE TABLE table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("table created...");
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
