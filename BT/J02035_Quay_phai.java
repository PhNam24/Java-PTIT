package BT;

import java.util.*;
public class J02035_Quay_phai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            int ans = 0;
            for(int i = 1; i < n; i++) {
                if(a[i] < a[i - 1]) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
