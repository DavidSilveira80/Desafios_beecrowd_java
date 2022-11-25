// becrowd-Iniciante-1012-Área
//https://www.beecrowd.com.br/judge/pt/problems/view/1012

// Triângulo retângulo -> ((a)Base * (c)altura) / 2
// Área do círculo -> PI * ((c)Raio ** 2)
// Trapezio ((c)altura * ((a)base menor + (b)base maior)) / 2
// Área do quadrado lado b -> b ** 2
//Área do retângulo -> (a)altura * b(base)

import java.util.Locale;
import java.util.Scanner;
public class Area {
    public static double calculoTriangulo(double a, double c){
        return (a * c) / 2;
    }

    public static double calculoCirculo(double c){
        return 3.14159 * (Math.pow(c, 2));
    }

    public static double calculoTrapezio(double a, double b, double c){
        return (c * (a + b)) / 2;
    }

    public static double claculoQuadrado(double b){
        return Math.pow(b, 2);
    }

    public static double calculoRetangulo(double a, double b){
        return a * b;
    }
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String[] entradaValores = entrada.nextLine().split(" ");

        double a = Double.parseDouble(entradaValores[0]);
        double b = Double.parseDouble(entradaValores[1]);
        double c = Double.parseDouble(entradaValores[2]);


        System.out.printf("TRIANGULO: %.3f\n", calculoTriangulo(a, c));
        System.out.printf("CIRCULO: %.3f\n", calculoCirculo(c));
        System.out.printf("TRAPEZIO: %.3f\n", calculoTrapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f\n", claculoQuadrado(b));
        System.out.printf("RETANGULO: %.3f\n", calculoRetangulo(a, b));
    }
}
