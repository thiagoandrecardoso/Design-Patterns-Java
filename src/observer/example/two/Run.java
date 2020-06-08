package observer.example.two;

public class Run {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();
        CarroPolicia carroPolicia = new CarroPolicia();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
    }
}
