package ui;
import java.awt.*;
import java.text.NumberFormat;
import models.Peca;
import services.EstoqueService;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

public class TelaEstoque extends JFrame {

    private final NumberFormat formatoMoeda =
            NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public TelaEstoque(ArrayList<Peca> pecas) {
        setLayout(new BorderLayout());

        setTitle("Relatório de Estoque");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel titulo = new JLabel("RELATÓRIO DE ESTOQUE");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        add(titulo, BorderLayout.NORTH);

        String[] colunas = {
                "ID",
                "Nome",
                "Quantidade",
                "Preço Unitário",
                "Valor Total"
        };

        DefaultTableModel model =
                new DefaultTableModel(colunas, 0){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };

        for(Peca peca : pecas){
            Object[] linha = {
                    peca.getId(),
                    peca.getNome(),
                    peca.getQuantidade(),
                    formatoMoeda.format(peca.getPrecoUnitario()),
                    formatoMoeda.format(peca.calcularValorTotal()),
            };
            model.addRow(linha);
        }
        JTable tabela = new JTable(model);
        tabela.setRowHeight(25);
        tabela.getTableHeader().setFont(
                new Font("Arial", Font.BOLD, 14)
        );
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);

        EstoqueService estoqueService =
                new EstoqueService(pecas);

        double patrimonioTotal =
                estoqueService.calcularPatrimonioTotal();

        Peca pecaMaisValiosa =
                estoqueService.descobrirPecaMaisValiosa();

        JLabel labelTotal;
        JLabel labelMaior;

        labelTotal = new JLabel("Patrimônio total: " + formatoMoeda.format(patrimonioTotal));

        labelMaior = new JLabel("Item mais valioso: " + pecaMaisValiosa.getNome() +
                " - " +
                formatoMoeda.format(pecaMaisValiosa.calcularValorTotal())
        );

        JPanel painelInferior = new JPanel();
        painelInferior.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );
        painelInferior.setLayout(new GridLayout(2, 1));
        painelInferior.add(labelTotal);
        painelInferior.add(labelMaior);

        add(painelInferior, BorderLayout.SOUTH);


        setVisible(true);

    }



}
