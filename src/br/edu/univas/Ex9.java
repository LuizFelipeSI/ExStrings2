package br.edu.univas;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] artigosPreposicoes = {"a", "as" , "o" , "os", "um", "uns", "uma", "umas",
                "de", "do", "dos", "da", "das", "dum", "duns", "duma", "dumas",
                "em", "no", "nos", "na", "nas", "num", "nuns", "numa", "numas",
                "a", "ao", "aos", "à", "às", "por", "pelo", "pelos", "pela", "pelas"};


        String frase = scan.nextLine();
        String[] fraseSemPreposicao = new String[frase.length()];
        char aux;

        String[] palavra = frase.split(" ");
        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < artigosPreposicoes.length; j++) {
                if (palavra[i].equalsIgnoreCase(artigosPreposicoes[j])) {
                    break;
                } else if (j == artigosPreposicoes.length-1 && !palavra[i].equalsIgnoreCase(artigosPreposicoes[j])) {
                    fraseSemPreposicao[i] = palavra[i];
                }
            }
        }

        for (int i = 0; i < fraseSemPreposicao.length; i++) {
            if (fraseSemPreposicao[i] != null){
                char[] chars = fraseSemPreposicao[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    for (int k = 0; k < chars.length; k++) {
                        if (chars[j] < chars[k]) {
                            aux = chars[k];
                            chars[k] = chars[j];
                            chars[j] = aux;
                        }
                    }
                }
                for (int l = 0; l < chars.length; l++) {
                    System.out.print(chars[l]);
                }
                System.out.print(" ");
            }
        }
    }
}
