import java.sql.*;

public class Daily_Expenses_Calculator {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Expenses_Calculator";
        String user = "postgres";
        String password = "Atharva@3113";

        // Clean, simple SQL — no quotes needed anymore!
        String insertSQL = "INSERT INTO calculations (member_id, name, expenses) VALUES (100, 'Permanent Fix', 9999.99)";
        String selectSQL = "SELECT member_id, name, expenses FROM calculations ORDER BY member_id";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection Established Successfully!");

            Statement stmt = con.createStatement();

            int rows = stmt.executeUpdate(insertSQL);
            System.out.println("Rows inserted: " + rows);

            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("\nID     | Name               | Expenses");
            System.out.println("-----------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("member_id");
                String name = rs.getString("name");
                double exp = rs.getDouble("expenses");
                System.out.printf("%-6d | %-18s | ₹%.2f%n", id, name, exp);
            }

            System.out.println("\nAll operations completed successfully!");

        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
    }
}