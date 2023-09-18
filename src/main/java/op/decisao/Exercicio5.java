package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Desenvolva um algoritmo computacional que faça 5 perguntas para uma pessoa
 * sobre um crime. As perguntas são:
 * a. "Telefonou para a vítima?"
 * b. "Devia dinheiro para a vítima?"
 * c. "Esteve no local do crime?"
 * d. "Mora perto da vítima?"
 * e. "Já trabalhou com a vítima?"
 * O programa deve no final emitir uma classificação sobre a participação da pessoa
 * no crime. Se a pessoa responder positivamente a duas questões ela deve ser
 * classificada como "Suspeita", entre três e quatro como "Cúmplice" e cinco como
 * "Assassino". Caso contrário, ele será classificado como "Inocente"
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em Lógica e Linguagem de Programação pelo IFBA - campus Camaçari.
 * @since 17/09/2023
 */
public class Exercicio5 {
    public static void main(String[] args) {
        // { ♥ } - Entrada de dados
        String a,b,c,d,e;
        a = JOptionPane.showInputDialog("\tResponda as perguntas a seguir"
                    + "\na. Telefonou para a vitima?"
                    + "\n\nb. Devia dinheiro para a vítima?"
                    + "\n\nc. Esteve no local do crime?"
                    + "\n\nd. Mora perto da vítima?"
                    + "\n\ne. Já trabalhou com a vítima?");

        b = JOptionPane.showInputDialog("\tResponda as perguntas a seguir"
                    + "\na. Telefonou para a vitima?\nR: " + a
                    + "\n\nb. Devia dinheiro para a vítima?"
                    + "\n\nc. Esteve no local do crime?"
                    + "\n\nd. Mora perto da vítima?"
                    + "\n\ne. Já trabalhou com a vítima?");
        c = JOptionPane.showInputDialog("\tResponda as perguntas a seguir"
                + "\na. Telefonou para a vitima?\nR: " + a
                + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                + "\n\nc. Esteve no local do crime?"
                + "\n\nd. Mora perto da vítima?"
                + "\n\ne. Já trabalhou com a vítima?");
        d = JOptionPane.showInputDialog("\tResponda as perguntas a seguir"
                + "\n\na. Telefonou para a vitima?\nR: " + a
                + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                + "\n\nc. Esteve no local do crime?\nR: " + c
                + "\n\nd. Mora perto da vítima?"
                + "\n\ne. Já trabalhou com a vítima?");
        e = JOptionPane.showInputDialog("\tResponda as perguntas a seguir"
                + "\n\na. Telefonou para a vitima?\nR: " + a
                + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                + "\n\nc. Esteve no local do crime?\nR: " + c
                + "\n\nd. Mora perto da vítima?\nR: " + d
                + "\n\ne. Já trabalhou com a vítima?");

        // { ... } - Processamento
        int classifica = 0;
        if (a.equalsIgnoreCase("sim")) {
            classifica += 1;
        }
        if (b.equalsIgnoreCase("sim")) {
            classifica += 1;
        }
        if (c.equalsIgnoreCase("sim")){
            classifica += 1;
        }
        if (d.equalsIgnoreCase("sim")){
            classifica += 1;
        }
        if (e.equalsIgnoreCase("sim")){
            classifica += 1;
        }
        String mensagem = "";
        if (!(classifica == 0)) {
            if (classifica == 2) {
                mensagem = "\tResponda as perguntas a seguir"
                        + "\na. Telefonou para a vitima?\nR: " + a
                        + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                        + "\n\nc. Esteve no local do crime?\nR: " + c
                        + "\n\nd. Mora perto da vítima?\nR: " + d
                        + "\n\ne. Já trabalhou com a vítima?\nR: " + e
                        + "\n\n\tClassificação: SUSPEITA.";
            }else if (classifica == 3 || classifica == 4){
                mensagem = "\tResponda as perguntas a seguir"
                        + "\na. Telefonou para a vitima?\nR: " + a
                        + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                        + "\n\nc. Esteve no local do crime?\nR: " + c
                        + "\n\nd. Mora perto da vítima?\nR: " + d
                        + "\n\ne. Já trabalhou com a vítima?\nR: " + e
                        + "\n\n\tClassificação: CÚMPLICE.";
            } else {
                mensagem = "\tResponda as perguntas a seguir"
                        + "\na. Telefonou para a vitima?\nR: " + a
                        + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                        + "\n\nc. Esteve no local do crime?\nR: " + c
                        + "\n\nd. Mora perto da vítima?\nR: " + d
                        + "\n\ne. Já trabalhou com a vítima?\nR: " + e
                        + "\n\n\tClassificação: ASSASSINO.";
            }
        } else {
            mensagem = "\tResponda as perguntas a seguir"
                    + "\na. Telefonou para a vitima?\nR: " + a
                    + "\n\nb. Devia dinheiro para a vítima?\nR: " + b
                    + "\n\nc. Esteve no local do crime?\nR: " + c
                    + "\n\nd. Mora perto da vítima?\nR: " + d
                    + "\n\ne. Já trabalhou com a vítima?\nR: " + e
                    + "\n\n\tClassificação: INOCENTE.";
        }

        // <(^-^♥)> - Resultado
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
