package BT;

import java.util.Scanner;

public class J03005_Chuan_hoa_xau_ho_ten_2 {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String[] s = scanner.nextLine().trim().toLowerCase().split("\\s+");
            for(int i = 1; i < s.length; i++) {
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            }
            for(int i = 1; i < s.length; i++) {
                System.out.print(s[i]);
                if (i < s.length - 1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(", ");
                }
            }
            System.out.println(s[0].toUpperCase());
        }
    }
}
