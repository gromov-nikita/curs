public class Runner {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        if(n % 2 == 0) {
            System.out.println(n*1.5);
        }
        else {
            System.out.println(n*n);
        }
    }
}
