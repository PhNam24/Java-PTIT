package BT;

import java.util.Scanner;

public class J03007_So_dep_2 {
    public static Scanner scanner = new Scanner(System.in);
    static String check(char[] s) {
        if(s[0] != '8' || s[s.length - 1] != '8') {
            return "NO";
        }
        int sum = 0;
        for(int i = 0; i < s.length; i++) {
            if (s[i] != s[s.length - i - 1]) {
                return "NO";
            }
            sum += s[i] - '0';
        }
        if(sum % 10 != 0) {
            return "NO";
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
