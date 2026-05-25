import java.util.Scanner;

class StudentView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println("\n----- Student Menu -----");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Marks");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
    }

    int getChoice() {

        System.out.print("Enter Choice: ");
        return sc.nextInt();
    }

    int getId() {

        System.out.print("Enter Student ID: ");
        return sc.nextInt();
    }

    String getName() {

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        return sc.nextLine();
    }

    int getMarks() {

        System.out.print("Enter Marks: ");
        return sc.nextInt();
    }

    void displayStudents(Student[] students, int count) {

        if (count == 0) {
            System.out.println("No Students Found");
            return;
        }

        System.out.println("\nStudent Details");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    "ID : " + students[i].id +
                    " | Name : " + students[i].name +
                    " | Marks : " + students[i].marks);
        }
    }

    void showStudent(Student s) {

        System.out.println("\nStudent Found");
        System.out.println("ID : " + s.id);
        System.out.println("Name : " + s.name);
        System.out.println("Marks : " + s.marks);
    }

    void showMessage(String msg) {
        System.out.println(msg);
    }
}