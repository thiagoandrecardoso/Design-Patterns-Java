package observer.classroom;

public class RunClass {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student student = new Student(teacher, "Jandir");
        Student student1 = new Student(teacher, "Thiago");

        teacher.setTestDay(6);
    }
}
