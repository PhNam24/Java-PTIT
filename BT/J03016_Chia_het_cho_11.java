package BT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016_Chia_het_cho_11 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = new BigInteger(String.valueOf(11));
            BigInteger zero = new BigInteger(String.valueOf(0));
            if(a.mod(b).equals(zero)) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
