import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Course Name: " + student.getCourse().getCourseName());
        System.out.println("Duration: " + student.getCourse().getDuration());
    }
}