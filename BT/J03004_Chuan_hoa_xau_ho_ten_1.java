package BT;

import java.util.Scanner;

public class J03004_Chuan_hoa_xau_ho_ten_1 {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String[] s = scanner.nextLine().trim().toLowerCase().split("\\s+");
            for(int i = 0; i < s.length; i++) {
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            }
            for(int i = 0; i < s.length; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
