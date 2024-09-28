package Java_loops;

import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            generateSeries(a, b, n);
        }

        scanner.close();
    }

    private static void generateSeries(int a, int b, int n) {
        int result = a;

        for (int j = 0; j < n; j++) {
            result += Math.pow(2, j) * b;
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
