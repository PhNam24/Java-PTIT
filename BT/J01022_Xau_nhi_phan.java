package BT;

import java.util.Scanner;
public class J01022_Xau_nhi_phan {
    public static Scanner scanner = new Scanner(System.in);
    public static long[] fibo = new long[100];
    public static char sol(int n, long k) {
        if (n == 1) {
            return '0';
        }
        if (n == 2) {
            return '1';
        }
        if (k <= fibo[n - 2]) {
            return sol(n - 2, k);
        }
        return sol(n - 1, k - fibo[n - 2]);
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i < 100; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        while(t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(sol(n, k));
        }
    }
}
