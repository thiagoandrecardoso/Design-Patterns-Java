package observer;

import observer.entity.CarroPolicia;
import observer.entity.CarroRoubado;

import java.util.Observer;

public class Run {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();
        CarroPolicia carroPolicia = new CarroPolicia();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
    }
}
