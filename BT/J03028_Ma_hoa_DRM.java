package BT;

import java.util.*;
public class J03028_Ma_hoa_DRM {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s = scanner.nextLine();
            int n = s.length() / 2;
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < n; i++) {
                sum1 += s.charAt(i) - 'A';
                sum2 += s.charAt(i + n) - 'A';
            }
            String ans = "";
            for(int i = 0; i < n; i++) {
                int tmp1 = s.charAt(i) - 'A';
                int code1 = (tmp1 + sum1) % 26;
                int tmp2 = s.charAt(i + n) - 'A';
                int code2 = (tmp2 + sum2) % 26;
                int code = (code1 + code2) % 26;
                ans += ((char)(code + 'A'));
            }
            System.out.println(ans);
        }
    }
}
