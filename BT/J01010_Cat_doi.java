package BT;

import java.util.Scanner;

public class J01010_Cat_doi {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            char[] s = new char[20];
            s = scanner.nextLine().toCharArray();
            int check = 1;
            for(int i = 0; i < s.length; i++) {
                if(s[i] != '0' && s[i] != '1' && s[i] != '8' && s[i] != '9') {
                    check = 0;
                    break;
                }
                if(s[i] == '8' || s[i] == '9') {
                    s[i] = '0';
                }
            }
            if(check == 0) {
                System.out.println("INVALID");
            }
            else {
                int idx = 0;
                for(; idx < s.length; idx++) {
                    if(s[idx] != '0') {
                        break;
                    }
                }
                if(idx == s.length) {
                    System.out.println("INVALID");
                }
                else {
                    for (int i = idx; i < s.length; i++) {
                        System.out.print(s[i]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
