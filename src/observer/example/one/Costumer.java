package observer.example.one;

public class Costumer implements Observer{

    private String costumerName;
    private Subject subject;

    @Override
    public void update(String productName) {
        System.out.println("Hello " + costumerName + ", " + productName + " avaliable");
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
