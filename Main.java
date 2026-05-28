public class Main {

    public static void main(String[] args) {

        StudentController controller =
            new StudentController();

        StudentView view =
            new StudentView();

        while (true) {

            view.showMenu();

            int choice =
                view.getChoice();

            switch (choice) {

                case 1:

                    int id =
                        view.getId();

                    String name =
                        view.getName();

                    int marks =
                        view.getMarks();

                    controller.addStudent(
                        id,
                        name,
                        marks);

                    break;

                case 2:

                    controller.displayStudents();
                    break;

                case 3:

                    controller.searchStudent(
                        view.getId());

                    break;

                case 4:

                    int uid =
                        view.getId();

                    int umarks =
                        view.getMarks();

                    controller.updateMarks(
                        uid,
                        umarks);

                    break;

                case 5:

                    controller.deleteStudent(
                        view.getId());

                    break;

                case 6:

                    System.out.println(
                        "Exiting...");
                    return;

                default:

                    System.out.println(
                        "Invalid Choice");
            }
        }
    }
}