package BT;

import java.util.Scanner;

public class J03038_Danh_dau_chu_cai {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        int[] d = new int[257];
        for(int i = 0; i < s.length(); i++) {
            d[(int)s.charAt(i)]++;
        }
        int cnt = 0;
        for(int i = 0; i < 257; i++) {
            if(d[i] != 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
