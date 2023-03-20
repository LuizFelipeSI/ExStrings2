package br.edu.univas;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char aux;

        String palavra = scan.next();
        char[]posicaoLetras = new char[palavra.length()];

        for (int j = 0; j < palavra.length(); j++) {
            posicaoLetras[j] = palavra.charAt(j);
        }

        for (int i = 0; i < posicaoLetras.length; i++) {
            for (int j = 0; j < posicaoLetras.length; j++) {
                if (posicaoLetras[i] > posicaoLetras[j]) {
                    aux = posicaoLetras[i];
                    posicaoLetras[i] = posicaoLetras[j];
                    posicaoLetras[j] = aux;
                }
            }
        }

        for(int i = 0; i < posicaoLetras.length; i++) {
            System.out.print(posicaoLetras[i]);
        }
    }
}
