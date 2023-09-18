package BT;

import java.util.Scanner;
public class J03025_Xau_doi_xung {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            char[] s = scanner.nextLine().toCharArray();
            int cnt = 0;
            for(int i = 0; i < s.length / 2; i++) {
                if(s[i] != s[s.length - i - 1]) {
                    cnt++;
                }
            }
            if((cnt == 1 && s.length % 2 == 0) || (cnt <= 1 && s.length % 2 != 0)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
