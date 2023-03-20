package br.edu.univas;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();
        int contador = 1;

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra.length(); j++) {
                if (j == i) {
                    continue;
                } else if (String.valueOf(palavra.charAt(i)).equals(String.valueOf(palavra.charAt(j)))) {
                    contador++;
                }
            }
            if (contador % 2 == 0) {
                System.out.print(palavra.charAt(i));
            }
            contador = 1;
        }
    }
}
