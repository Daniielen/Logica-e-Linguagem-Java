package op.decisao;

import javax.swing.*;

/**
 * @author Danielen Santana
 * @details Dado um número inteiro positivo qualquer, verificar se ele possui cinco dígitos.
 * Em caso afirmativo, decidir se esse número é palíndromo ímpar (número palíndromo é aquele que é igual
 * quando lido nas duas direções: esquerda-direita ou direita-esquerda).
 * Exemplos de números palíndromos ímpares: 98589, 73137 e 10801.
 * @note Prática: Operação de Decisão na linguagem Java.
 * Exercício criado pelo Prof Dr.Josildo Silva para o curso em
 * Lógica e Linguagem de Programação pelo IFBA - campus Camaçari.
 * @since 18/09/2023
 */
public class Exercicio6 {
    public static void main(String[] args){

        // { ♥ } - Declaração de variveis e Entrada de dados
        String resposta, mensagem = "";
        resposta = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(resposta);
        int n_1, n_2, n_3, n_4, n_5;
        boolean isEqual, isImpar;

        // { ... } - Processamento
        n_1 = numero / 10000;
        n_2 = (numero % 10000) / 1000;
        n_3 = (numero % 1000) / 100;
        n_4 = (numero % 100) / 10;
        n_5 = (numero % 10);

        isEqual = (n_1 == n_5)
                && (n_2 == n_4);

        isImpar = (n_1 % 2 != 0)
                && (n_2 % 2 != 0)
                && (n_3 % 2 != 0)
                && (n_4 % 2 != 0)
                && (n_5 % 2 != 0);

        if ((numero > 9999 && numero < 100000) && (numero > 0)) {
            if (isEqual && isImpar){
                mensagem = "O número " + numero + " é um palíndromo ímpar!";
            } else {
                mensagem = "Não é um palíndromo ímpar";
            }
        } else {
            mensagem = "O valor precisa conter 5 dígitos.";
        }

        // <(^-^♥)> - Resultado
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
