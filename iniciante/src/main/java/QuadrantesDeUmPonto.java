//beecrowd-Iniciante-1041-Coordenadas de um Ponto
//https://www.beecrowd.com.br/judge/pt/problems/view/1041

import java.util.Scanner;
public class QuadrantesDeUmPonto {
    public static String quadranteCoordenada(double x, double y){
        String quadrante = "";
        if(x == 0 && y == 0){
            quadrante = "Origem";
        }else if(x > 0 && y > 0){
            quadrante = "Q1";
        }else if(x > 0 && y < 0){
            quadrante = "Q4";
        }else if(x < 0 && y < 0){
            quadrante = "Q3";
        }else if(x < 0 && y > 0){
            quadrante = "Q2";
        }else if(x > 0 && y == 0){
            quadrante = "Eixo X";
        }else if(x < 0 && y == 0){
            quadrante = "Eixo X";
        }else if(x == 0 && y > 0){
            quadrante = "Eixo Y";
        }else if(x == 0 && y < 0){
            quadrante = "Eixo Y";
        }
        return quadrante;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String[] entradaCoordenadas = entrada.nextLine().split(" ");

        double X = Double.parseDouble(entradaCoordenadas[0]);
        double Y = Double.parseDouble(entradaCoordenadas[1]);

        System.out.println(quadranteCoordenada(X, Y));

    }
}
