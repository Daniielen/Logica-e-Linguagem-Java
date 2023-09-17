package op.decisao;

import com.sun.jdi.Value;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dados valores quaisquer para os coeficientes 𝑎, 𝑏, 𝑐 da expressão geral de uma
 * equação do segundo grau 𝑎𝑥^2 + 𝑏𝑥 + 𝑐 = 0, deve-se verificar se trata ou não de uma
 * equação do segundo grau. Em caso afirmativo deve-se informar quantas raízes a
 * equação possui e seus respectivos valores.
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em Lógica e Linguagem de Programação pelo IFBA.
 * @since 17/09/2023
 */

public class Exercicio3 {
    public static void main(String[] args) {
        String resposta;
        resposta = JOptionPane.showInputDialog(null, "\t" + "Equação do Segundo Grau"
                + "\nDigite o valor do coeficiente a:");
        double a = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "\t" + "Equação de Segundo Grau"
                + "\nDigite o valor do coeficiente b:");
        double b = Float.parseFloat(resposta);

        resposta = JOptionPane.showInputDialog(null, "\t" + "Equação de Segundo Grau"
                + "\nDigite o valor do coeficiente c:");
        double c = Float.parseFloat(resposta);

        String mensagem = "";
        if (!(a == 0)) { // Verifica se é ou não equação de segundo grau
            double delta, x_1, x_2, raiz;
            delta = (float) Math.pow(b, 2) - (4 * a * c);
            raiz = Math.sqrt(delta);
            x_1 = (-(b) + raiz) / (2 * a);
            x_2 = (-(b) - raiz) / (2 * a);

            if ((x_1 != 0) && (x_2 != 0)) {
                mensagem = "A equação possui 2 raízes " + "\nx' = " + x_1 + "\nx'' = " + x_2;
            } else if ((x_1 != 0) && (x_2 == 0)) {
                mensagem = "A equação possui 1 raíz " + "\nx' = " + x_1 + "\nx'' = " + x_2;
            } else if ((x_1 == 0) && (x_2 != 0)) {
                mensagem = "A equação possui 1 raízes " + "\nx' = " + x_1 + "\nx'' = " + x_2;
            } else {
                mensagem = "A equação não possui raízes ";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
