package BT;

import java.util.Scanner;

public class J03027_Rut_gon_xau_ky_tu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        while(true) {
            int check = 0;
            for(int i = 1; i < s.length(); i++) {
                if(s.charAt(i) == s.charAt(i - 1)) {
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                    check = 1;
                    break;
                }
            }
            if(check == 0) {
                break;
            }
        }
        if (s.isEmpty()) {
            System.out.println("Empty String");
        }
        else {
            System.out.println(s);
        }
    }
}
