import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        double d1,d2,d3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("d1 = ");
        d1 = scanner.nextDouble();
        System.out.println("d2 = ");
        d2 = scanner.nextDouble();
        System.out.println("d3 = ");
        d3 = scanner.nextDouble();
        System.out.println("Answer : " + (d1 + d2 + d3)/3);
    }
}
