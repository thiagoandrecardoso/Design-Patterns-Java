package behavioral.observer.example.two;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {

    String acao = "";
    @Override
    public void frente() {
        acao = "frente";
        System.out.println("carro roubado frente");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("carro roubado direita");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("carro roubado esquerda");
        this.mudaEstado();
    }

    @Override
    public void para() {
        acao = "para";
        System.out.println("carro roubado para");
        this.mudaEstado();
    }

    public void mudaEstado(){
        setChanged();
        notifyObservers(acao);
    }
}
