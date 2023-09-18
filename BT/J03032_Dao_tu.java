package BT;

import java.util.Scanner;

public class J03032_Dao_tu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String[] s = scanner.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++) {
                String tmp = "";
                for(int j = 0; j < s[i].length(); j++) {
                    tmp = s[i].charAt(j) + tmp;
                }
                s[i] = tmp;
            }
            for(int i = 0; i < s.length; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
