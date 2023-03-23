package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OMaior {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        List<Integer> numerosInformados = new ArrayList<>();
        String[] numeroString = entrada.nextLine().split(" ");

        numerosInformados.add(Integer.parseInt(numeroString[0]));
        numerosInformados.add(Integer.parseInt(numeroString[1]));
        numerosInformados.add(Integer.parseInt(numeroString[2]));

        int maior = Collections.max(numerosInformados);


        System.out.printf("%d eh o maior\n", maior);
    }
}
