package BT;

import java.util.Scanner;

public class J01017_So_lien_ke {
    public static Scanner scanner = new Scanner(System.in);
    static String check(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            System.out.println(check(scanner.nextLine()));
        }
    }
}
