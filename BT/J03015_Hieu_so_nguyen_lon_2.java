package BT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015_Hieu_so_nguyen_lon_2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger ans = a.subtract(b)  ;
        System.out.println(ans);
    }
}
