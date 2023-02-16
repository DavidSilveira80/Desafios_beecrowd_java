package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

    public static Double area_calculo(double raio){
        Double n = 3.14159;
        double area = n * (raio * raio);
        return area;
    }
    public static String saida_area_circulo(double raio){
        Locale.setDefault(Locale.US);
        String resultado = String.format("A=%.4f", area_calculo(raio));
        return resultado;
    }
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double r = entrada.nextDouble();

        // Imprime no terminal a saída formatada
        System.out.println(saida_area_circulo(r));
    }
}
