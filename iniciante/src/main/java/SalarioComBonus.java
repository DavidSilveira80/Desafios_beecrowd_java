/*
                                  beecrowd | 1009
                                 Salário com Bônus
                         Adaptado por Neilor Tonin, URI  Brasil

                                     Timelimit: 1
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e o
 total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
 vendedor ganha 15% de comissão sobre suas vendas efetuadas,
 informar o total a receber no final do mês, com duas casas decimais.

 Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão
 (double) com duas casas decimais, representando o salário fixo do vendedor e montante total
 das vendas efetuadas por este vendedor, respectivamente.

 Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

Exemplos de Entrada                     Exemplos de Saída

JOAO                                    TOTAL = R$ 684.54
500.00
1230.30

PEDRO                                    TOTAL = R$ 700.00
700.00
0.00

MANGOJATA                                TOTAL = R$ 1884.58
1700.00
1230.50
*/

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
    public static double calculo_salario_bonus(double salx, double vendas){
        double comissao = vendas * 0.15;
        double salario_mais_comissao = salx + comissao;
        return salario_mais_comissao;
    }

    public static String saida_salario_bonus(double sal_bonus){
        Locale.setDefault(Locale.US);
        String saida = String.format("TOTAL = R$ %.2f", sal_bonus);
        return saida;
    }
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        double salario_fixo = entrada.nextDouble();
        double vendas_efetuadas_dinheiro = entrada.nextDouble();

        double salario_com_bonus = calculo_salario_bonus(salario_fixo, vendas_efetuadas_dinheiro);
        System.out.println(saida_salario_bonus(salario_com_bonus));
    }
}
