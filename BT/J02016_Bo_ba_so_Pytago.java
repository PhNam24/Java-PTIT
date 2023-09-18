package BT;

import java.util.*;
public class J02016_Bo_ba_so_Pytago {
    static boolean binarySearch(long[] a, int l, int r, long x) {
        if(r >= l) {
            int m = (r + l) / 2;
            if(a[m] == x) {
                return true;
            }
            if(a[m] < x) {
                return binarySearch(a, m + 1, r, x);
            }
            if(a[m] > x) {
                return binarySearch(a, l, m - 1, x);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++ ) {
                long tmp = scanner.nextLong();
                a[i] = tmp * tmp;
            }
            Arrays.sort(a);
            boolean check = false;
            String ans = "NO";
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(binarySearch(a, 0, n - 1, a[i] + a[j])) {
                        check = true;
                        ans = "YES";
                        break;
                    }
                }
                if(check) {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}