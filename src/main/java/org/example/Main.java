package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vinde a FarmaCom!");

        Produtos synus = new Produtos();
        synus.nome = "Synus";
        synus.descricao = "\n" +
                "Tylenol Sinus é um medicamento analgésico e antitérmico, indicado para o alívio " +
                "temporário dos sintomas decorrentes de gripes, resfriados comuns e sinusites.";
        synus.preco = 16.45;

        synus.precisaDeReceita();
        synus.mostrarProdutos();

        Produtos amoxilina = new Produtos();
        amoxilina.nome = "Amoxilina";
        amoxilina.tarja = true;
        amoxilina.descricao =
                "Amoxicilina combate infecções causadas por bactérias que podem se manifestar " +
                        "nos pulmões (pneumonia e bronquite), nas amígdalas (amigdalite), nos seios da face (sinusite), " +
                        "no trato urinário e genital, na pele e nas mucosas.";


    }

}