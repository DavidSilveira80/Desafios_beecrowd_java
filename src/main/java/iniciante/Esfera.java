package iniciante;//beecrowd-Iniciante-1011-Esfera
//https://www.beecrowd.com.br/judge/pt/problems/view/1011

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int raio = entrada.nextInt();

        double volume = (4 / 3.0) * (3.14159 * Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
