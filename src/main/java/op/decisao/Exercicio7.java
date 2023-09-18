package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dados os três valores 𝑎, 𝑏, 𝑐 quaisquer para os lados de um triângulo. Uma vez que
 * esses valores sejam positivos, verificar se os mesmos formam realmente um
 * triângulo, e se essa condição for verdadeira, indicar qual o tipo do triângulo:
 * isósceles, escaleno, equilátero. E no caso de ser triangulo escaleno informar se é
 * retângulo ou não.
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em
 * Lógica e Linguagem de Programação pelo IFBA - campus Camaçari.
 * @since 18/09/2023
 */

public class Exercicio7 {
    public static void main(String[] args) {
        // { ♥ } - Entrada de dados
        String resposta;

        resposta = JOptionPane.showInputDialog("Informe os valores de a, b e c para os lados de um triângulo: "
                + "\nValor de a) ");
        float a = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog("""
                Informe os valores de a, b e c para os lados de um triângulo:\s
                Valor de a)\s
                Valor de b)\s""");
        float b = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog("""
                Informe os valores de a, b e c para os lados de um triângulo:"\s
                Valor de a)\s
                Valor de b)\s
                Valor de c)\s""");

        float c = Float.parseFloat(resposta);

        // { ... } - Processamento
        if ((a > 0) && (b > 0) && (c > 0)) {
            float soma_AB, soma_AC, soma_BC, ab, ac, bc;

            // Módulo
            ab = Math.abs(a) - Math.abs(b);
            ac = Math.abs(a) - Math.abs(c);
            bc = Math.abs(c) - Math.abs(b);

            // Soma
            soma_AB = a + b;
            soma_AC = a + c;
            soma_BC = b + c;

            boolean first_cond, second_cond, third_cond;

            first_cond = (bc < a && a < soma_BC);
            second_cond = (ac < b && b < soma_AC);
            third_cond = (ab < c && c < soma_AB);

            String mensagem = "";

            if ((a > 0) && (b > 0) && (c > 0)){
                if (first_cond || second_cond || third_cond) {
                    if ((a == b && a == c && b != c) || (b == c && b == a && a != c) || (c == a && c == b && a != b)) {
                        mensagem = "Os valores abaixo"
                                + "\na) " + a
                                + "\nb) " + b
                                + "\nc) " + c
                                + "\nFormam um triângulo isósceles!";
                    } else if (a == b && a == c && b == c) {
                        mensagem = "Os valores abaixo"
                                + "\na) " + a
                                + "\nb) " + b
                                + "\nc) " + c
                                + "\nFormam um triângulo equilátero!";
                    } else if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) {
                        mensagem = "Os valores abaixo"
                                + "\na) " + a
                                + "\nb) " + b
                                + "\nc) " + c
                                + "\nFormam um triângulo escaleno.\nO triângulo escaleno é retângulo";
                    }
                } else {
                    mensagem = "Os valores abaixo"
                            + "\na) " + a
                            + "\nb) " + b
                            + "\nc) " + c
                            + "\nFormam um triângulo escaleno.\nO triângulo escaleno não é retângulo";
                }
            }else {
                mensagem = "Os valores a, b e c precisam ser positivos!";
            }

            // <(^-^♥)> - Resultado
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
