import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 1;
        for(int i = 2; i <= n; i++) {
            answer *= i;
        }
        System.out.println("n! = " + answer);
    }
}
