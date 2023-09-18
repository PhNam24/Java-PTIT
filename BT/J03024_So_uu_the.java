package BT;

import java.util.Scanner;

public class J03024_So_uu_the {
    public static Scanner scanner = new Scanner(System.in);
    static String check(char[] s) {
        int chan = 0, le = 0;
        for(int i = 0; i < s.length; i++) {
            if(!Character.isDigit(s[i])) {
                return "INVALID";
            }
            if((s[i] - '0') % 2 == 0) {
                chan++;
            }
            else {
                le++;
            }
        }
        if(chan == le) {
            return "NO";
        }
        if(s.length % 2 == 0) {
            if(chan < le) {
                return "NO";
            }
        }
        else {
            if(le < chan) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            char[] s = scanner.nextLine().toCharArray();
            System.out.println(check(s));
        }
    }
}
