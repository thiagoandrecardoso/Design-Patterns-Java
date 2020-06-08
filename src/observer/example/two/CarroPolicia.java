package observer.example.two;

import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Carro, Observer {
    @Override
    public void frente() {
        System.out.println("viatura frente");
    }

    @Override
    public void direita() {
        System.out.println("viatura direita");
    }

    @Override
    public void esquerda() {
        System.out.println("viatura esquerda");
    }

    @Override
    public void para() {
        System.out.println("viatura para");
    }

    @Override
    public void update(Observable o, Object arg) {
        CarroRoubado carroRoubado = (CarroRoubado)o;
        String acao = (String)arg;

        if(acao.equals("frente")){
            this.frente();
        }
        else if(acao.equals("direita")){
            this.frente();
        }
        else if(acao.equals("esquerda")){
            this.frente();
        }
        else if(acao.equals("para")){
            this.frente();
        }
    }
}
