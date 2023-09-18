package BT;

import java.util.Scanner;

public class J03021_Dien_thoai_cuc_gach {
    public static Scanner scanner = new Scanner(System.in);
    static String check(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
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
            char[] s = scanner.nextLine().toLowerCase().toCharArray();
            for(int i = 0; i < s.length; i++) {
                if(s[i] == 'a' || s[i] == 'b' || s[i] == 'c') {
                    s[i] = '2';
                }
                if(s[i] == 'd' || s[i] == 'e' || s[i] == 'f') {
                    s[i] = '3';
                }
                if(s[i] == 'g' || s[i] == 'h' || s[i] == 'i') {
                    s[i] = '4';
                }
                if(s[i] == 'j' || s[i] == 'k' || s[i] == 'l') {
                    s[i] = '5';
                }
                if(s[i] == 'm' || s[i] == 'n' || s[i] == 'o') {
                    s[i] = '6';
                }
                if(s[i] == 'p' || s[i] == 'q' || s[i] == 'r' || s[i] == 's') {
                    s[i] = '7';
                }
                if(s[i] == 't' || s[i] == 'u' || s[i] == 'v') {
                    s[i] = '8';
                }
                if(s[i] == 'w' || s[i] == 'x' || s[i] == 'y' || s[i] == 'z') {
                    s[i] = '9';
                }
            }
            System.out.println(check(s));
        }
    }
}
