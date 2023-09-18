package BT;

import java.util.Scanner;

public class J01018_So_khong_lien_ke {
    public static Scanner scanner = new Scanner(System.in);
    static String check(String s) {
        int sum = s.charAt(s.length() - 1) - '0';
        for(int i = 0; i < s.length() - 1; i++) {
            if(Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1)) != 2) {
                return "NO";
            }
            sum += s.charAt(i) - '0';
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
            System.out.println(check(scanner.nextLine()));
        }
    }
}
