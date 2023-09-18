package BT;

import java.util.Scanner;

public class J01007_Kiem_tra_so_Fibonacci {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;

        for(int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        int t = scanner.nextInt();
        while(t > 0) {
            long n = scanner.nextLong();
            String ans = "NO";
            for(int i = 0; i <= 92; i++) {
                if(n == fibo[i]) {
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}