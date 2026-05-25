public class Main {

    public static void main(String[] args) {

        StudentController controller =
                new StudentController(100);

        StudentView view =
                new StudentView();

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    int id = view.getId();
                    String name = view.getName();
                    int marks = view.getMarks();

                    controller.addStudent(id, name, marks);

                    view.showMessage(
                            "Student Added Successfully");
                    break;

                case 2:

                    view.displayStudents(
                            controller.getStudents(),
                            controller.getCount());
                    break;

                case 3:

                    int searchId = view.getId();

                    Student s =
                            controller.findStudent(searchId);

                    if (s != null)
                        view.showStudent(s);
                    else
                        view.showMessage(
                                "Student Not Found");

                    break;

                case 4:

                    int updateId = view.getId();

                    int newMarks = view.getMarks();

                    view.showMessage(
                            controller.updateMarks(
                                    updateId,
                                    newMarks));
                    break;

                case 5:

                    int deleteId = view.getId();

                    view.showMessage(
                            controller.deleteStudent(
                                    deleteId));
                    break;

                case 6:

                    System.out.println(
                            "Exiting Program...");
                    return;

                default:

                    System.out.println(
                            "Invalid Choice");
            }
        }
    }
}