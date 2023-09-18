package BT;

import java.util.Scanner;

public class J01016_Chu_so_4_va_chu_so_7 {
    public static Scanner scanner = new Scanner(System.in);
    static String check(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '4' || s.charAt(i) == '7') {
                cnt++;
            }
        }
        if(cnt == 4 || cnt == 7) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        System.out.println(check(scanner.nextLine()));
    }
}
