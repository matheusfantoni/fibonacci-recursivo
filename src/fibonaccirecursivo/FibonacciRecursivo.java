package fibonaccirecursivo;

import java.util.Scanner;

public class FibonacciRecursivo {

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long tempo1 = System.currentTimeMillis();

        System.out.println("Tempo inicial = " + tempo1);

        for (int i = 1; i <= 80; i++) {
            System.out.println(fibonacci(i));
        }

        long tempo2 = System.currentTimeMillis();
        System.out.println("Tempo final = " + tempo2);

        System.out.println(tempo2 - tempo1);

    }

}
