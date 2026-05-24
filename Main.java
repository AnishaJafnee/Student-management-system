public class Main {

    public static void main(String[] args) {

        StudentController controller =
                new StudentController(10);

        StudentView view = new StudentView();

        controller.addStudent(101, "Anisha", 85);
        controller.addStudent(102, "John", 78);
        controller.addStudent(103, "David", 90);

        while (true) {

            view.showMenu();
            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    view.displayStudents(
                            controller.getStudents(),
                            controller.getCount());
                    break;

                case 2:

                    int searchId = view.getId();

                    if (controller.findStudent(searchId) != null)
                        view.showMessage("Student Found");
                    else
                        view.showMessage("Student Not Found");

                    break;

                case 3:

                    int updateId = view.getId();
                    int marks = view.getMarks();

                    view.showMessage(
                            controller.updateMarks(updateId, marks));
                    break;

                case 4:

                    int deleteId = view.getId();

                    view.showMessage(
                            controller.deleteStudent(deleteId));
                    break;

                case 5:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}