import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName(
                "com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "Anisha@2006");

            System.out.println(
                "Database Connected");

        } catch(Exception e) {

            System.out.println(e);
        }

        return con;
    }
}