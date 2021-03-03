import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.format("Array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        Boolean bool = false;
        for(int i = 0; i < 5; i++) {
            System.out.format("Array[%d] = %d\n", i, array[i]);
            bool = array[i] % 2 == 0 ? true : false;
            if(bool) {
                System.out.println("1) Even");
            }
            else {
                System.out.println("1) Uneven");
            }
            bool = array[i] % (i+1) == 0 ? true : false;
            if(bool) {
                System.out.println("2) Делится без остатка на свой порядковый номер");
            }
            else {
                System.out.println("2) Не делится без остатка на свой порядковый номер");
            }
        }
    }
}
