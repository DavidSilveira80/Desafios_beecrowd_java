/*
                                       beecrowd | 1040
                                            Média 3
                           Adaptado por Neilor Tonin, URI  Brasil

                                         Timelimit: 1

Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1,
respectivamente, para cada uma destas notas e mostre esta média acompanhada pela
mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem
"Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem
"Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9,
inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida
pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada.
Recalcule a média (some a pontuação do exame com a média anteriormente calculada e
divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais )
 ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
 Para estes dois casos (aprovado ou reprovado após ter pego exame)
 apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal.
As mensagens devem ser impressas conforme a descrição do problema.
Não esqueça de imprimir o enter após o final de cada linha,
caso contrário obterá "Presentation Error".


Exemplo de Entrada                        Exemplo de Saída

2.0 4.0 7.5 8.0                             Media: 5.4
6.4                                         Aluno em exame.
                                            Nota do exame: 6.4
                                            Aluno aprovado.
                                            Media final: 5.9

2.0 6.5 4.0 9.0                             Media: 4.8
                                            Aluno reprovado.

9.0 4.0 8.5 9.0                             Media: 7.3
                                            Aluno aprovado.

*/

import java.util.Scanner;

public class Media3 {
    public static double[] converterArrayStringParaDouble(String... arrayEntradaString) {

        double[] saidaArrayDouble = new double[arrayEntradaString.length];
        for (int contador = 0; contador < arrayEntradaString.length; contador++) {
            saidaArrayDouble[contador] = Double.parseDouble(arrayEntradaString[contador]);
        }
        return saidaArrayDouble;
    }

    public static double calculoMediaPonderada3(double n1, double n2, double n3, double n4) {
        double resultadoMediaPonderada = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);
        return resultadoMediaPonderada;
    }

    public static double calculoMediaExameFinal(double n1, double n2, double n3, double n4, double notaExamefinal) {
        double mediaFinal = (calculoMediaPonderada3(n1, n2, n3, n4) + notaExamefinal) / 2;
        return mediaFinal;
    }

    public static String statusFinalAluno(double media) {
        String resultadoStatusAluno = null;
        if (media >= 7.0) {
            resultadoStatusAluno = "Aluno aprovado.";
        } else if (media < 5.0) {
            resultadoStatusAluno = "Aluno reprovado.";
        } else if (media >= 5.0 && media <= 6.9) {
            resultadoStatusAluno = "Aluno em exame.";
        }
        return resultadoStatusAluno;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] entradaStringArray = entrada.nextLine().split(" ");

        double[] arrayDouble = converterArrayStringParaDouble(entradaStringArray);

        double N1 = arrayDouble[0];
        double N2 = arrayDouble[1];
        double N3 = arrayDouble[2];
        double N4 = arrayDouble[3];
        /*
        double mediaP = calculoMediaPonderada3(N1, N2, N3, N4);
        System.out.println(mediaP);

        String resultadoFinal = statusFinalAluno(mediaP);

        if(resultadoFinal == "Aluno em exame."){
            double notaExame = entrada.nextDouble();
            System.out.println("exame");
            double mediaFinal = calculoMediaExameFinal(N1, N2, N3, N4, notaExame);
            if(mediaFinal <= 4.9){
                System.out.println(statusFinalAluno(mediaFinal));
            }

         */
    }
}






