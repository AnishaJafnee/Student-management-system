import java.sql.*;

public class StudentController {

    Connection con;

    StudentController() {

        con = DBConnection.getConnection();
    }

    void addStudent(int id,
                    String name,
                    int marks) {

        try {

            String check =
                "SELECT * FROM students WHERE id=?";

            PreparedStatement checkStmt =
                con.prepareStatement(check);

            checkStmt.setInt(1, id);

            ResultSet rs =
                checkStmt.executeQuery();

            if(rs.next()) {

                System.out.println(
                    "ID already exists");

                return;
            }

            String query =
                "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement pst =
                con.prepareStatement(query);

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, marks);

            pst.executeUpdate();

            System.out.println(
                "Student Added Successfully");

        } catch(Exception e) {

            System.out.println(e);
        }
    }

    void displayStudents() {

        try {

            String query =
                "SELECT * FROM students";

            Statement st =
                con.createStatement();

            ResultSet rs =
                st.executeQuery(query);

            System.out.println(
                "\n--- Student Details ---");

            while(rs.next()) {

                System.out.println(
                    rs.getInt("id")
                    + " | " +
                    rs.getString("name")
                    + " | " +
                    rs.getInt("marks"));
            }

        } catch(Exception e) {

            System.out.println(e);
        }
    }

    void searchStudent(int id) {

        try {

            String query =
                "SELECT * FROM students WHERE id=?";

            PreparedStatement pst =
                con.prepareStatement(query);

            pst.setInt(1, id);

            ResultSet rs =
                pst.executeQuery();

            if(rs.next()) {

                System.out.println(
                    rs.getInt("id")
                    + " | " +
                    rs.getString("name")
                    + " | " +
                    rs.getInt("marks"));

            } else {

                System.out.println(
                    "Student Not Found");
            }

        } catch(Exception e) {

            System.out.println(e);
        }
    }

    void updateMarks(int id,
                     int marks) {

        try {

            String query =
                "UPDATE students SET marks=? WHERE id=?";

            PreparedStatement pst =
                con.prepareStatement(query);

            pst.setInt(1, marks);
            pst.setInt(2, id);

            int rows =
                pst.executeUpdate();

            if(rows > 0) {

                System.out.println(
                    "Marks Updated Successfully");

            } else {

                System.out.println(
                    "Student ID Not Found");
            }

        } catch(Exception e) {

            System.out.println(e);
        }
    }

    void deleteStudent(int id) {

        try {

            String query =
                "DELETE FROM students WHERE id=?";

            PreparedStatement pst =
                con.prepareStatement(query);

            pst.setInt(1, id);

            int rows =
                pst.executeUpdate();

            if(rows > 0) {

                System.out.println(
                    "Student Deleted Successfully");

            } else {

                System.out.println(
                    "Student ID Not Found");
            }

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}