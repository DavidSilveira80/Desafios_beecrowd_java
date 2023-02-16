/*
                                        beecrowd | 1007
                                         Diferença
                           Adaptado por Neilor Tonin, URI  Brasil

                                         Timelimit: 1

Leia quatro valores inteiros A, B, C e D. A
seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo,
com um espaço em branco antes e depois da igualdade

Exemplos de Entrada                        Exemplos de Saída

5                                          DIFERENCA = -26
6
7
8

0                                          DIFERENCA = -56
0
7
8

5                                           DIFERENCA = 86
6
-7
8




 */
import java.util.Scanner;

public class Diferenca {
    public static int calculo_diferenca(int a, int b, int c, int d){
        return (a * b) - (c * d);
    }
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        System.out.printf("DIFERENCA = %d\n", calculo_diferenca(A, B, C, D));

    }
}
