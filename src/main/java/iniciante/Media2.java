/*
                                         beecrowd | 1006
                                             Média 2
                              Adaptado por Neilor Tonin, URI  Brasil

                                             Timelimit: 1

eia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B
tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0,
sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo,
com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
caso contrário, você receberá "Presentation Error".

Exemplos de Entrada           Exemplos de Saída

5.0                           MEDIA = 6.3
6.0
7.0

5.0                           MEDIA = 9.0
10.0
10.0

10.0                          MEDIA = 7.5
10.0
5.0

 */
import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static double media_ponderada2(double nota_a, double nota_b, double nota_c){
        return ((nota_a * 2) + (nota_b * 3) + (nota_c * 5)) / (2 + 3 + 5);
    }

    public static String saida_media_ponderada2(double media){
        Locale.setDefault(Locale.US);
        String resultado = String.format("MEDIA = %.1f", media);
        return resultado;
    }
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        double media_p2 = media_ponderada2(A, B, C);

        System.out.println(saida_media_ponderada2(media_p2));

    }
}
