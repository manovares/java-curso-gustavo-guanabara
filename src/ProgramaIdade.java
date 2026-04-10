import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano que voce nasceu");
        int nasc = input.nextInt();
        int i = 2026-nasc;
        if (i>=18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
