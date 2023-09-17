package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dados valores de três notas, o total de aulas ministradas, e o número de faltas de
 * um estudante em uma disciplina qualquer deve-se verificar a sua situação final:
 * Aprovado, Reprovado por falta ou Reprovado por média. A média para aprovação é
 * 7,0 e o limite de faltas é 25% do total de aulas ministradas. A reprovação por falta
 * ocorrerá mesmo que o estudante tenha média suficiente para aprovação.
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em Lógica e Linguagem de Programação pelo IFBA.
 * @since 17/09/2023
 */
public class Exercicio4 {
    public static void main(String[] args){
        float nota_0, nota_1, nota_2;
        int aulas_ministradas, qtd_faltas;

        String resposta;

        resposta = JOptionPane.showInputDialog("\tPainel Escolar: Notas/Aulas Ministradas/Numero de faltas"
        + "\nPrimeira nota: ");
        nota_0 = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog("\tPainel Escolar: Notas/Aulas Ministradas/Numero de faltas"
                + "\nPrimeira nota: ");
        nota_1 = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog("\tPainel Escolar: Notas/Aulas Ministradas/Numero de faltas"
                + "\nPrimeira nota: ");
        nota_2 = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog("\tPainel Escolar: Notas/Aulas Ministradas/Numero de faltas"
                + "\nAulas Ministradas: ");
        aulas_ministradas = Integer.parseInt(resposta);

        resposta = JOptionPane.showInputDialog("\tPainel Escolar: Notas/Aulas Ministradas/Numero de faltas"
                + "\nNúmero de faltas: ");
        qtd_faltas = Integer.parseInt(resposta);

        float media;
        media = (nota_0 + nota_1 + nota_2) / 3;

        float porcentagem = (qtd_faltas * 100) / aulas_ministradas;

        String mensagem = "";

        if ((media >= 7) && (porcentagem <= 25.0)) {
            mensagem = "\tSituação: Aprovado" + "\t\nDetalhamento\nMédia final: " + media + "\nPorcentagem de faltas: " + porcentagem;
        } else if (((media >= 7) && (porcentagem > 25.0)) || ((media < 7) && (porcentagem < 25.0))) {
            mensagem = "Situação: Reprovado" + "\t\nDetalhamento\nMédia final: " + media + "\nPorcentagem de faltas: " + porcentagem;;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
