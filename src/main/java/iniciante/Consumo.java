//beecrowd-Iniciante-1014-Consumo

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int distancia = entrada.nextInt();
        double combustivelGasto = entrada.nextDouble();

        double calculoConsumo = distancia / combustivelGasto;

        System.out.printf("%.3f km/l\n", calculoConsumo);
    }
}
