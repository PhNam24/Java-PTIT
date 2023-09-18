package BT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03012_Tong_so_nguyen_lon_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
