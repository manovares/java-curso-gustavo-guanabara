package OperadoresAritmetricos;

public class Calculadora {
    public static void main(String[] args) {
        int num = 12;
        int div = num % 2;
        double elevadoCubo = Math.pow(num,3);
        double raizQuadrado = Math.sqrt(num);
        double RaizCubica = Math.cbrt(num);

        System.out.println("Resto da divisão por 2: " + div);
        System.out.println("Elevado ao cubo: " + elevadoCubo);
        System.out.println("Raiz quadrado: " + raizQuadrado);
        System.out.println("Raiz cubica: " + RaizCubica);
        System.out.println("Valor absoluto: " + num);
    }
}
