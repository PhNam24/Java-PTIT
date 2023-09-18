package BT;

import java.util.Scanner;

public class J02008_Boi_so_cua_N_so_nguyen_duong_dau_tien {
    public static Scanner scanner = new Scanner(System.in);
    static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            long n = scanner.nextLong();
            long ans = 1;
            for(long i = 2; i <= n; i++) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
    }
}
