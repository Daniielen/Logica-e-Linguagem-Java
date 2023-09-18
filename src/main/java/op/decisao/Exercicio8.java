package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dado nomes e notas de três estudantes deve-se exibir nome e notas dos estudantes
 * na ordem decrescente de nota (da maior para a menor). Todo processamento só
 * deve ocorrer com todas as notas válidas (valores não negativos e diferentes entre
 * si).
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em
 * Lógica e Linguagem de Programação pelo IFBA - campus Camaçari.
 * @since 18/09/2023
 */
public class Exercicio8 {
    public static void main(String[] args) {

        // { ♥ } - Entrada de Dados
        String resposta, nome_1, nome_2, nome_3;
        float nota_1, nota_2, nota_3;

        // Dados do primeiro estudante
        nome_1 = JOptionPane.showInputDialog("""
                \tInforme nome e nota de 3 (três) estudantes:\s
                1) Nome:
                """);
        resposta = JOptionPane.showInputDialog("""
                \tInforme nome e nota de 3 (três) estudantes:\s
                1) Nota:
                """);
        nota_1 = Float.parseFloat(resposta);

        // Dados do segundo estudante
        nome_2 = JOptionPane.showInputDialog("""
                \tInforme nome e nota de 3 (três) estudantes:\s
                2) Nome:
                """);
        resposta = JOptionPane.showInputDialog("""
                \tInforme nome e nota de 3 (três) estudantes:\s
                2) Nota:
                """);
        nota_2 = Float.parseFloat(resposta);

        // Dados do terceiro estudante
        nome_3 = JOptionPane.showInputDialog("""
                \tInforme nome e nota de 3 (três) estudantes:\s
                3) Nome:
                """);
        resposta = JOptionPane.showInputDialog("""
                \tInforme nome e nota de 3 (três) estudantes:\s
                3) Nota:
                """);
        nota_3 = Float.parseFloat(resposta);

        // { ... } - Processamento
        boolean isPositive, isDifferent;
        String mensagem = "";

        isPositive = (nota_1 > 0) && (nota_2 > 0) && (nota_3 > 0);
        isDifferent = (nota_1 != nota_2) && (nota_1 != nota_3) && (nota_2 != nota_3);

        if (isPositive && isDifferent) {
            if ((nota_1 > nota_2) && (nota_1 > nota_3) && (nota_2 > nota_3)) { // Ordem Decresc: 1, 2, 3
                mensagem = "Nomes" + "     " + "Notas"
                        + "\n" + nome_1 + "     " + nota_1
                        + "\n" + nome_2 + "     " + nota_2
                        + "\n" + nome_3 + "     " + nota_3;
            } else if ((nota_1 > nota_2) && (nota_1 > nota_3) && (nota_3 > nota_2)){
                mensagem = "Nomes" + "     " + "Notas"
                        + "\n" + nome_1 + "     " + nota_1
                        + "\n" + nome_3 + "     " + nota_3
                        + "\n" + nome_2 + "     " + nota_2;
            }else if ((nota_2 > nota_1) && (nota_2 > nota_3) && (nota_1 > nota_3)) { // Ordem Decresc: 2, 1, 3
                mensagem = "Nomes\t\t" + "Notas"
                        + "\n" + nome_2 + "     " + nota_2
                        + "\n" + nome_1 + "     " + nota_1
                        + "\n" + nome_3 + "     " + nota_3;
            } else if ((nota_2 > nota_1) && (nota_2 > nota_3) && (nota_3 > nota_1)) { // Ordem Decresc: 2, 3, 1
                mensagem = "Nomes\t\t" + "     " + "Notas"
                        + "\n" + nome_2 + "     " + nota_2
                        + "\n" + nome_3 + "     " + nota_3
                        + "\n" + nome_1 + "     " + nota_1;
            } else if ((nota_3 > nota_1) && (nota_3 > nota_2) && (nota_1 > nota_2)){ // Ordem Decresc: 3, 1, 2
                mensagem = "Nomes\t\t" + "     " + "Notas"
                        + "\n" + nome_3 + "     " + nota_3
                        + "\n" + nome_1 + "     " + nota_1
                        + "\n" + nome_2 + "     " + nota_2;
            } else { // Ordem Decresc: 3, 2, 1
                mensagem = "Nomes\t\t" + "     " + "Notas"
                        + "\n" + nome_3 + "     " + nota_3
                        + "\n" + nome_2 + "     " + nota_2
                        + "\n" + nome_1 + "     " + nota_1;
            }
        } else {
            mensagem = "Somente valores positivos e diferentes entre si.";
        }

        // <(^-^♥)> - Resultado
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
