package observer.classroom;

public class Student implements Observer{
    private int testDay;
    private Subject teacher;
    private String nome;

    public Student(Subject teacher, String nome) {
        this.nome = nome;
        this.teacher = teacher;
        teacher.registerObserver(this);
    }

    @Override
    public void update(int note) {
        this.testDay = note;
        displau();
    }

    public void displau(){
        System.out.println("Aluno " + nome + " dia do teste " + testDay);
    }
}
