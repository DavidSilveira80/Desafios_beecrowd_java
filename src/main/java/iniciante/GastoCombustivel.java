//beecrowd-Iniciante-1017-Gasto Combustivel

import java.util.Scanner;
import java.util.Locale;

public class GastoCombustivel {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int tempoGasto = entrada.nextInt();
        int velocidadeMedia = entrada.nextInt();

        double combustivelGasto = (tempoGasto * velocidadeMedia) / 12.0;

        String saida = String.format("%.3f", combustivelGasto);
        System.out.println(saida);
    }
}
