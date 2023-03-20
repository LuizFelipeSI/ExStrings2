package br.edu.univas;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();

        for (int i = 0; i < palavra.length(); i++) {
            if (String.valueOf(palavra.charAt(i)).equals("a") || String.valueOf(palavra.charAt(i)).equals("e") || String.valueOf(palavra.charAt(i)).equals("i") || String.valueOf(palavra.charAt(i)).equals("o") || String.valueOf(palavra.charAt(i)).equals("u")) {
                System.out.print(palavra.charAt(i));
                System.out.print(palavra.charAt(i));
            } else {
                System.out.print(palavra.charAt(i));
            }
        }
    }
}
