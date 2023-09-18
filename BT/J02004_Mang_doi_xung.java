package BT;

import java.util.Scanner;

public class J02004_Mang_doi_xung {
    public static Scanner scanner = new Scanner(System.in);
    static String check(int[] a) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] != a[a.length - i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int [n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(check(a));
        }
    }
}
