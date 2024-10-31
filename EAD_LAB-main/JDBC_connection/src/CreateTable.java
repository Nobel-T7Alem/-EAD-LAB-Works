import java.sql.*;

public class CreateTable {
    public static void main(String[] args){
        try {
            String url = "jdbc:mysql://localhost:3306/StudentDB";
            String username = "root";
            String password = "sqlstart";
            
            Connection connection = DriverManager.getConnection(url, username, password);
    
            Statement statement = connection.createStatement();
    
            String createTableSQL = "CREATE TABLE students (id INT PRIMARY KEY, firstname VARCHAR(255), lastname VARCHAR(255), grade INT)"; 
            statement.executeUpdate(createTableSQL);
            System.out.println("Table students Created Successfuly!");
    
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
