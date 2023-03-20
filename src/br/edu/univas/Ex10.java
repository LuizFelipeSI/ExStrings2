package br.edu.univas;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] palavrasPermitidas = new String[10];

        palavrasPermitidas[0] = "talvez";
        palavrasPermitidas[1] = "porém";
        palavrasPermitidas[2] = "fazer";
        palavrasPermitidas[3] = "trabalho";
        palavrasPermitidas[4] = "acordo";
        palavrasPermitidas[5] = "geralmente";
        palavrasPermitidas[6] = "aceitável";
        palavrasPermitidas[7] = "manipular";
        palavrasPermitidas[8] = "razão";
        palavrasPermitidas[9] = "feliz";

        String frase = scan.nextLine();
        String[] frasePalavarasPermitidas = new String[frase.length()];

        String[] palavra = frase.split(" ");
        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < palavrasPermitidas.length; j++) {
                if (palavra[i].equals(palavrasPermitidas[j])) {
                    frasePalavarasPermitidas[j] = palavra[i];
                    break;
                }
            }
        }

        for (int i =0; i < palavrasPermitidas.length; i++) {
            if (frasePalavarasPermitidas[i] != null) {
                System.out.print(palavrasPermitidas[i] + " ");
            }
        }
    }
}
