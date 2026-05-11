import models.Peca;
import ui.TelaEstoque;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<Peca> pecas = new ArrayList<>();
        pecas.add(new Peca(1L, "Motor", 3, 1500.00));
        pecas.add(new Peca(2L, "Escapamento", 5, 7500.00));
        pecas.add(new Peca(3L, "Engrenagem", 2, 3500.00));
        pecas.add(new Peca(4L, "Rolamento", 4, 1700.00));
        pecas.add(new Peca(5L, "Cambio", 1, 1500.00));

        new TelaEstoque(pecas);

    }
}