package br.edu.univas;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();
        char[] letras = new char[palavra.length()];
        int posicaoChar = 0;
        int contador = 1;

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra.length(); j++) {
                if (j == i) {
                    continue;
                } else if (String.valueOf(palavra.charAt(i)).equals(String.valueOf(palavra.charAt(j)))) {
                    contador++;
                }
            }
            if (contador > 1) {
                for (int j = 0; j < letras.length; j++) {
                    if (palavra.charAt(i) == letras[j]){
                        break;
                    } else if (j == letras.length-1 && palavra.charAt(i) != letras[j]){
                        System.out.println("(" + palavra.charAt(i) + ")" + " - " + contador);
                        letras[posicaoChar] = palavra.charAt(i);
                        posicaoChar++;
                    }
                }
            }
            contador = 1;
        }
    }
}
