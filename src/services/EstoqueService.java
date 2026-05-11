package services;

import models.Peca;

import java.util.ArrayList;

public class EstoqueService {
    private ArrayList<Peca> pecas;

    public EstoqueService(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }

    public double calcularPatrimonioTotal(){
        double patrimonioTotal = 0;
        for (Peca peca : pecas){
            patrimonioTotal += peca.calcularValorTotal();
        }
        return patrimonioTotal;
    }

    public Peca descobrirPecaMaisValiosa(){
        if(pecas.isEmpty()){
            return null;
        }

        Peca maior = pecas.get(0);

        for(Peca peca : pecas){
            if(peca.calcularValorTotal() > maior.calcularValorTotal()){
                maior = peca;
            }
        }
        return maior;
    }
}
