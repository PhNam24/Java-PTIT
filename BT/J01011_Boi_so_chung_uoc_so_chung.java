package BT;

import java.util.Scanner;

public class J01011_Boi_so_chung_uoc_so_chung {
    public static Scanner scanner = new Scanner(System.in);
    static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return  gcd(b, a % b);
    }
    public static void main(String[] args) {;
        int t = scanner.nextInt();
        while(t-- > 0) {
            long a = scanner.nextLong(), b = scanner.nextLong();
            System.out.println((a * b) / gcd(a, b) + " " + gcd(a, b));
        }
    }
}
