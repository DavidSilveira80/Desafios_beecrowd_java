// beecrowd-Iniciante-1010-Cálculo Simples
// https://www.beecrowd.com.br/judge/pt/problems/view/1010

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String[] entradaPeca1 = entrada.nextLine().split(" ");
        String[] entradaPeca2 = entrada.nextLine().split(" ");

        int codigoPeca1 = Integer.parseInt(entradaPeca1[0]);
        int numeroDePeca1 = Integer.parseInt(entradaPeca1[1]);
        double valorPeca1 = Double.parseDouble(entradaPeca1[2]);

        int codigoPeca2 = Integer.parseInt(entradaPeca2[0]);
        int numeroDePeca2 = Integer.parseInt(entradaPeca2[1]);
        double valorPeca2 = Double.parseDouble(entradaPeca2[2]);

        double valorTotalDePecas1 = numeroDePeca1 * valorPeca1;
        double valorTotalDePecas2 = numeroDePeca2 * valorPeca2;

        double valorTotalDasPecas = valorTotalDePecas1 + valorTotalDePecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotalDasPecas);

    }
}
