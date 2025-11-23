import java.sql.*;

public class Daily_Expenses_Calculator {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Expenses_Calculator";
        String user = "postgres";
        String pass = "Atharva@3113";

        // No Class.forName needed with PostgreSQL 42.x driver
        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Connection Established Successfully!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}