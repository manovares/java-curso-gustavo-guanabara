package OperadoresAritmetricos;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        System.out.println("media = " + media);

        int numero = 5;
        int valor = 4 + ++numero;
        System.out.println("valor = " + valor);
        System.out.println("numero = " + numero);

        int x = 4;
        x += 2;
        System.out.println("x = " + x);

        double resp = Math.sqrt(25);
        double pi = Math.PI;
        double pow = Math.pow(resp,2);
        double cubico = Math.cbrt(27);
        System.out.println("cubico = " + cubico);
        System.out.println("pow = " + pow);
        System.out.println("pi = " + pi);
        System.out.println("resp = " + resp);
    }
}
