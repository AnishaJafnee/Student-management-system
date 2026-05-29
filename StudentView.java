import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println(
            "\n--- STUDENT MANAGEMENT SYSTEM ---");

        System.out.println(
            "1. Add Student");

        System.out.println(
            "2. Display Students");

        System.out.println(
            "3. Search Student");

        System.out.println(
            "4. Update Marks");

        System.out.println(
            "5. Delete Student");

        System.out.println(
            "6. Exit");
    }

    int getChoice() {

        System.out.print(
            "Enter Choice: ");

        return sc.nextInt();
    }

    int getId() {

        System.out.print(
            "Enter ID: ");

        return sc.nextInt();
    }

    String getName() {

        sc.nextLine();

        System.out.print(
            "Enter Name: ");

        return sc.nextLine();
    }

    int getMarks() {

        System.out.print(
            "Enter Marks: ");

        return sc.nextInt();
    }
}