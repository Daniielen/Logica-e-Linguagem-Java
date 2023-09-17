package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dado a idade de um indivíduo informe sua classificação de período de vida considerando a seguinte tabela:
 * |     Idade   |   Período de vida   |
 * --------------|----------------------
 * | 0 à 9       |        Infância     |
 * | 10 à 14     |   Pré-adolescência  |
 * | 15 à 21     |      Adolescência   |
 * | 22 à 64     |        Adulto       |
 * | Acima de 64 |        Idoso        |
 * -------------------------------------
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em Lógica e Linguagem de Programação pelo IFBA.
 * @since 15/09/2023
 */

public class Exercicio1 {
    public static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog("Classificação de período de vida"
                + "\nInforme a idade: ");
        int idade = Integer.parseInt(resposta);
        String mensagem;
        if (!(idade <= -1)) {
            if (idade <= 9) {
                mensagem = "Período de vida: Infância";
            } else if (idade <= 14) {
                mensagem = "Pré-Adolescencia";
            } else if (idade <= 21) {
                mensagem = "Adolescência";
            } else if (idade <= 64) {
                mensagem = "Adulto(a)";
            } else {
                mensagem = "Idoso";
            }
        } else {
            mensagem = "Erro: Não é válido valores negativos.";
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
