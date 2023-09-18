package BT;

import java.util.Scanner;

public class J01024_So_tam_phan {
    public static Scanner scanner = new Scanner(System.in);

    static String check(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                return "NO";
            }
        }
        return  "YES";
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            System.out.println(check(scanner.nextLine()));
        }
    }
}
