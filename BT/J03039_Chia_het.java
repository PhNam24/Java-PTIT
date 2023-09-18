package BT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039_Chia_het {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger Min = a.min(b);
            BigInteger Max = a.max(b);
            BigInteger zero = BigInteger.valueOf(0);
            if(Max.mod(Min).compareTo(zero) == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
