package br.edu.univas;

public class Ex8 {

    public static boolean isValid(String cnh) {

        if (cnh == null || cnh.length() != 11) {
            return false;
        }

        // Verifica se todos os caracteres da CNH são dígitos
        for (int i = 0; i < 11; i++) {
            if (!Character.isDigit(cnh.charAt(i))) {
                return false;
            }
        }

        // Calcula o dígito verificador da CNH
        int soma = 0;
        int peso = 9;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cnh.substring(i, i + 1)) * peso;
            peso--;
        }
        int resto = soma % 11;
        int dv1 = resto >= 2 ? 11 - resto : 0;

        // Verifica se o primeiro dígito verificador está correto
        if (dv1 != Integer.parseInt(cnh.substring(9, 10))) {
            return false;
        }

        // Recalcula o dígito verificador da CNH
        soma = 0;
        peso = 1;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(cnh.substring(i, i + 1)) * peso;
            peso++;
        }
        resto = soma % 11;
        int dv2 = resto >= 2 ? 11 - resto : 0;

        // Verifica se o segundo dígito verificador está correto
        if (dv2 != Integer.parseInt(cnh.substring(10))) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String cnh = "12345678901";
        boolean isValid = Ex8.isValid(cnh);
        if (isValid) {
            System.out.println("A CNH é válida");
        } else {
            System.out.println("A CNH é inválida");
        }
    }
}
