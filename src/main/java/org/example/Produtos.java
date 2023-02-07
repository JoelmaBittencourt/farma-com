package org.example;

public class Produtos {

    String nome;
    String descricao;
    boolean tarja;
    double preco;

    public void precisaDeReceita() {
        if (!tarja)
            System.out.println("é necessario apresentar receita médica para a compra desse medicamento");
    }

    public void mostrarProdutos() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Tarja: " + tarja);
        System.out.println("Preço: " + preco);
        System.out.println("------------------------------------------------");

    }
}

