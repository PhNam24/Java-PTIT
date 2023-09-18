package BT;

import java.util.Scanner;

public class J03008_So_dep_3 {
    public static Scanner scanner = new Scanner(System.in);
    static int snt(int n) {
        if(n < 2) {
            return 0;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    static String check(char[] s) {
        for(int i = 0; i < s.length; i++) {
            if(snt(s[i] - '0') == 0) {
                return "NO";
            }
            if (s[i] != s[s.length - i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(check(s.toCharArray()));
        }
    }
}
