package BT;

import java.util.Scanner;

public class J01006_Tinh_so_Fibonacci {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;

        for(int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        long t = scanner.nextLong();
        while(t > 0) {
            int n = scanner.nextInt();
            System.out.println(fibo[n]);
            t--;
        }
    }
}
