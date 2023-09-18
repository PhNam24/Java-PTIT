package BT;

import java.util.Scanner;

public class J01026_So_chinh_phuong {
    public static Scanner scanner = new Scanner(System.in);
    static String check(int n) {
        if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            System.out.println(check(scanner.nextInt()));
        }
    }
}
