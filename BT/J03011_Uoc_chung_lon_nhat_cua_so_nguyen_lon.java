package BT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_Uoc_chung_lon_nhat_cua_so_nguyen_lon {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger ans = a.gcd(b);
            System.out.println(ans);
        }
    }
}
