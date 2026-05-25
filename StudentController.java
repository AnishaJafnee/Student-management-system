class StudentController {

    Student[] students;
    int count;

    StudentController(int size) {
        students = new Student[size];
        count = 0;
    }

    void addStudent(int id, String name, int marks) {

        if (count < students.length) {
            students[count++] = new Student(id, name, marks);
        } else {
            System.out.println("Storage Full!");
        }
    }

    Student[] getStudents() {
        return students;
    }

    int getCount() {
        return count;
    }

    Student findStudent(int id) {

        for (int i = 0; i < count; i++) {

            if (students[i].id == id) {
                return students[i];
            }
        }

        return null;
    }

    String updateMarks(int id, int marks) {

        Student s = findStudent(id);

        if (s == null)
            return "Student Not Found";

        s.marks = marks;
        return "Marks Updated Successfully";
    }

    String deleteStudent(int id) {

        for (int i = 0; i < count; i++) {

            if (students[i].id == id) {

                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                count--;
                return "Student Deleted Successfully";
            }
        }

        return "Student Not Found";
    }
}