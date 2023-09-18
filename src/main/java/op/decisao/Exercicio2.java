package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dados os nomes e as idades de três pessoas,
 * selecionar (mostrar) nome e idade do mais jovem caso as idades sejam positivas e diferentes entre si.
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em Lógica e Linguagem de Programação pelo IFBA - campus Camaçari.
 * @since 15/09/2023
 */

public class Exercicio2 {
    public static void main(String[] args) {
        // { ♥ } - Declaração de variveis
        String nome_0, nome_1, nome_2, resposta;
        int idade_0, idade_1, idade_2;

        //  { ♥  } - Entrada de Dados
        nome_0 = JOptionPane.showInputDialog("1) Nome: ");
        resposta = JOptionPane.showInputDialog("1) Idade: ");
        idade_0 = Integer.parseInt(resposta);

        nome_1 = JOptionPane.showInputDialog("2) Nome: ");
        resposta = JOptionPane.showInputDialog("2) Idade: ");
        idade_1 = Integer.parseInt(resposta);

        nome_2 = JOptionPane.showInputDialog("3) Nome: ");
        resposta = JOptionPane.showInputDialog("2) Idade: ");
        idade_2 = Integer.parseInt(resposta);

        String mensagem;

        // {...} -  Processamento
        if (!((idade_0 == idade_1) && (idade_0 == idade_2) && (idade_1 == idade_2))) {
            if (!((idade_0 < 1) && (idade_1 < 1) && (idade_2 < 1))) {
                if (idade_0 < idade_1 && idade_0 < idade_2) {
                    mensagem = nome_0 + " com " + idade_0 + "anos, é o(a) mais jovem!";
                } else if (idade_1 < idade_0 && idade_1 < idade_2) {
                    mensagem = nome_1+ " com " + idade_1 + "anos, é o(a) mais jovem!";
                } else {
                    mensagem = nome_2 + " com " + idade_2 + "anos, é o(a) mais jovem!";
                }
            } else {
                mensagem = "Erro: Idade somente com valores positivos";
            }
        } else {
            mensagem = "Erros: As idades precisam ser diferentes entre si";
        }

        // <(^-^♥)> - Resultado
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
