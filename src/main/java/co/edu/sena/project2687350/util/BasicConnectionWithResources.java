package co.edu.sena.project2687350.util;

import java.sql.*;
public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Bogota";
        String username = "nicolas1";
        String password = "2n0i0c6o";

        String sql = "SELECT * FROM myapp.users_tbl";
        try (Connection conn =
                     DriverManager.getConnection(url,username,password);
        Statement stmt= conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {

                System.out.println(rs.getString("user_firstname"));

                System.out.println(rs.getString("user_lastname"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
