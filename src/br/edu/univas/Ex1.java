package br.edu.univas;

import java.util.Scanner;

public class Ex1 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra.length(); j++) {
                if (j == i) {
                    continue;
                } else if (String.valueOf(palavra.charAt(i)).equals(String.valueOf(palavra.charAt(j)))) {
                    break;
                } else if (j == palavra.length()-1 && palavra.charAt(i) != palavra.charAt(j))  {
                    System.out.print(palavra.charAt(i));
                } else if (i == palavra.length()-1 && j == palavra.length()-2) {
                    System.out.print(palavra.charAt(i));
                }
            }
        }
    }
}
