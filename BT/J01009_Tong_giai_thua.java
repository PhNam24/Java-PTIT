package BT;

import java.util.Scanner;

public class J01009_Tong_giai_thua {
    public static Scanner scanner = new Scanner(System.in);
    static long gt(int n) {
        long ans = 1;
        for(int i = 2; i <= n; i++) {
            ans *= i;
        }
        return  ans;
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        long s = 0;
        for(int i = 1; i <= n; i++) {
            s += gt(i);
        }
        System.out.println(s);
    }
}
