import java.util.List;

public class TestCRUD {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        // Create new students
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setAge(20);
        studentDao.saveStudent(student1);

        Student student2 = new Student();
        student2.setName("Jane Smith");
        student2.setAge(22);
        studentDao.saveStudent(student2);

        // Read all students
        System.out.println("All Students:");
        List<Student> students = studentDao.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Update a student
        student1.setAge(21);
        studentDao.updateStudent(student1);
        System.out.println("Updated Student: ID: " + student1.getId() + ", Name: " + student1.getName() + ", Age: " + student1.getAge());

        // Delete a student
        studentDao.deleteStudent(student2.getId());
        System.out.println("Deleted Student with ID: " + student2.getId());

        // Read all students after deletion
        System.out.println("All Students after deletion:");
        students = studentDao.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}