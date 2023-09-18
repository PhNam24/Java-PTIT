package BT;

import  java.util.*;
public class J03031_Xau_day_du {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s = scanner.nextLine();
            int k = Integer.parseInt(scanner.nextLine());
            int[] d = new int[256];
            for(int i = 0; i < s.length(); i++) {
                d[(int)s.charAt(i)]++;
            }
            int cnt = 0;
            for(int i = 0; i < 256; i++) {
                if(d[i] != 0) {
                    cnt++;
                }
            }
            cnt = 26 - cnt;
            if(cnt <= k) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
