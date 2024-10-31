
//Task-2

import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String username ="root";
            String password = "sqlstart";

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            Object[][] insertStatements = {
                {1, "Abebe", "Kedir", 85},
                {2, "Marta", "Tadesse", 92},
                {3, "Saba", "Mekonnen", 78},
                {4, "Yared", "Tesfaye", 88},
                {5, "Selam", "Girma", 95},
                {6, "Liya", "Hailu", 70},
                {7, "Samson", "Getachew", 82},
                {8, "Belen", "Fekadu", 76},
                {9, "Khalid", "Alemayehu", 89},
                {10, "Hana", "Kebede", 90}

            };

            for (Object[] student : insertStatements) {
                String insertStatement = String.format("INSERT INTO students (id, firstname,lastname,grade) VALUE(%d , '%s' , '%s' , %d)",(int)student[0],(String)student[1],(String)student[2],(int)student[3]);
                statement.executeUpdate(insertStatement);

            }
            System.out.println("Data inserted successfully!");

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
    }
    
}
