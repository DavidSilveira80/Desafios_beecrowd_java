/*
                                      beecrowd | 1008
                                         Salário
                         Adaptado por Neilor Tonin, URI  Brasil

                                        Timelimit: 1
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário
recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço
em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço
em branco após o $.

Exemplos de Entrada              Exemplos de Saída

25                               NUMBER = 25
100                              SALARY = U$ 550.00
5.50

1                                NUMBER = 1
200                              SALARY = U$ 4100.00
20.50

6                                NUMBER = 6
145                              SALARY = U$ 2254.75
15.55

 */

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static double calculo_salario(int horas_trabalhadas, double valor_hora){
        return horas_trabalhadas * valor_hora;
    }

    public static String saida_calculo_salario(int numero, double salario){
        Locale.setDefault(Locale.US);
        String resultado = String.format("NUMBER = %d\nSALARY = U$ %.2f", numero, salario);
        return resultado;
    }

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int number = entrada.nextInt();
        int horas_de_trabalho = entrada.nextInt();
        double valor_por_hora = entrada.nextDouble();

        double salario_calculado = calculo_salario(horas_de_trabalho, valor_por_hora);

        System.out.println(saida_calculo_salario(number, salario_calculado));
    }
}
