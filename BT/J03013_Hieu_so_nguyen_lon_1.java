package BT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_Hieu_so_nguyen_lon_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger ans = a.subtract(b).abs();
            int len = Math.max(a.toString().length(), b.toString().length());
            len -= ans.toString().length();
            for(int i = 0; i < len; i++) {
                System.out.print(0);
            }
            System.out.println(ans);
        }
    }
}
