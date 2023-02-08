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
    public double somarTotal() {
        System.out.println("O valor total da sua compra é " + preco);
        return preco += preco;
    }
    public boolean verificaMaiorDeIdade(int idade) {
        if (idade < 18)
            System.out.println("Precisa ser maior que 18 anos");
        return false;
    }
}

