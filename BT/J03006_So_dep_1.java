package BT;

import java.util.Scanner;

public class J03006_So_dep_1 {
    public static Scanner scanner = new Scanner(System.in);
    static String check(char[] s) {
        for(int i = 0; i < s.length; i++) {
            if(s[i] != '0' && s[i] != '2' && s[i] != '4' && s[i] != '6' && s[i] != '8') {
                return "NO";
            }
            if(s[i] != s[s.length - i - 1]) {
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
