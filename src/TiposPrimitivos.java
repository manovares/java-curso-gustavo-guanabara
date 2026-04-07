import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        float nota = input.nextFloat();
        System.out.format("A nota de " + nome +"é " + nota);
    }
}
