import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float m = (n1/n2)/2;
        System.out.println("MEDIA: " + m);
        if(m>9){
            System.out.println("Parabens!");
        }
    }
}
